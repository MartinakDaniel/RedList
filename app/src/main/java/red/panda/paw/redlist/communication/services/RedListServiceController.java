package red.panda.paw.redlist.communication.services;

import android.support.annotation.NonNull;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.inject.Inject;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import red.panda.paw.redlist.communication.models.Citations;
import red.panda.paw.redlist.communication.models.Countries;
import red.panda.paw.redlist.communication.models.Regions;
import red.panda.paw.redlist.communication.models.SpeciesByCategory;
import red.panda.paw.redlist.communication.models.SpeciesById;
import red.panda.paw.redlist.communication.models.SpeciesCount;
import red.panda.paw.redlist.communication.services.apis.RedListAPI;
import red.panda.paw.redlist.communication.services.interceptors.AuthenticationInterceptor;
import red.panda.paw.redlist.config.Constants;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * The service controller for the Red List.
 */
public class RedListServiceController {

    /**
     * The red list API.
     */
    protected final RedListAPI redListAPI;

    /**
     * The constructor of the {@link RedListServiceController} class.
     *
     * @param authenticationToken the authentication token for the Red List API.
     */
    @Inject
    public RedListServiceController(@NonNull final String authenticationToken) {
        final Gson gson = new GsonBuilder().setLenient().create();

        final HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        final AuthenticationInterceptor authenticationInterceptor = new AuthenticationInterceptor(authenticationToken);
        final OkHttpClient client = new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).addInterceptor
                (authenticationInterceptor).build();

        final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.RED_LIST_BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        redListAPI = retrofit.create(RedListAPI.class);
    }

    /**
     * Gets the countries list from the server.
     *
     * @param callback the callback. Have to handle the response on the calling side.
     */
    public void getCountries(@NonNull final Callback<Countries> callback) {
        final Call<Countries> call = redListAPI.loadCountries();
        call.enqueue(callback);
    }

    /**
     * Gets the count of the global species.
     *
     * @param callback the count of the global species.
     */
    public void getGlobalSpeciesCount(@NonNull final Callback<SpeciesCount> callback) {
        final Call<SpeciesCount> call = redListAPI.loadGlobalSpeciesCount();
        call.enqueue(callback);
    }

    /**
     * Gets the count of the regional species.
     *
     * @param callback the count of the regional species.
     * @param region   the region.
     */
    public void getRegionalSpeciesCount(@NonNull final Callback<SpeciesCount> callback, @NonNull final String region) {
        final Call<SpeciesCount> call = redListAPI.loadRegionalSpeciesCount(region);
        call.enqueue(callback);
    }

    /**
     * Gets the regions.
     *
     * @param regionsCallback the regions' callback.
     */
    public void getRegions(@NonNull final Callback<Regions> regionsCallback) {
        final Call<Regions> call = redListAPI.loadRegions();
        call.enqueue(regionsCallback);
    }

    /**
     * Gets the citation by the given species ID.
     *
     * @param callback the citations callback.
     * @param id       the ID of the species.
     */
    public void getCitationsBySpeciesId(@NonNull final Callback<Citations> callback, @NonNull final String id) {
        final Call<Citations> call = redListAPI.loadCitationsBySpeciesId(id);
        call.enqueue(callback);
    }

    /**
     * Gets the citation by the given species ID.
     *
     * @param callback the citations callback.
     * @param id       the ID of the species.
     * @param region   the region.
     */
    public void getRegionalCitationsBySpeciesId(@NonNull final Callback<Citations> callback, @NonNull final String id,
            @NonNull final String region) {
        final Call<Citations> call = redListAPI.loadRegionalCitationsBySpeciesId(id, region);
        call.enqueue(callback);
    }

    /**
     * Gets the species by the given category.
     *
     * @param callback the species by category callback.
     * @param category the category.
     */
    public void getSpeciesByCategory(@NonNull final Callback<SpeciesByCategory> callback,
            @NonNull final String category) {
        final Call<SpeciesByCategory> call = redListAPI.loadSpeciesByCategory(category);
        call.enqueue(callback);
    }

    /**
     * Gets the species by the given ID.
     *
     * @param callback the species by ID callback.
     * @param id       the ID.
     */
    public void getSpeciesById(@NonNull final Callback<SpeciesById> callback, @NonNull final String id) {
        final Call<SpeciesById> call = redListAPI.loadSpeciesById(id);
        call.enqueue(callback);
    }
}
