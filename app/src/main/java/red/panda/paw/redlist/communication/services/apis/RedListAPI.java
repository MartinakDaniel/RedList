package red.panda.paw.redlist.communication.services.apis;

import red.panda.paw.redlist.communication.models.Citations;
import red.panda.paw.redlist.communication.models.Countries;
import red.panda.paw.redlist.communication.models.Regions;
import red.panda.paw.redlist.communication.models.SpeciesByCategory;
import red.panda.paw.redlist.communication.models.SpeciesById;
import red.panda.paw.redlist.communication.models.SpeciesCount;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * The IUCN Red List API.
 */
public interface RedListAPI {

    @GET("country/list")
    Call<Countries> loadCountries();

    @GET("speciescount")
    Call<SpeciesCount> loadGlobalSpeciesCount();

    @GET("speciescount/region/{region}")
    Call<SpeciesCount> loadRegionalSpeciesCount(@Path("region") String region);

    @GET("region/list")
    Call<Regions> loadRegions();

    @GET("citation/id/{id}")
    Call<Citations> loadCitationsBySpeciesId(@Path("id") String id);

    @GET("citation/id/{id}/region/{region}")
    Call<Citations> loadRegionalCitationsBySpeciesId(@Path("id") String id, @Path("region") String region);

    @GET("species/category/{category}")
    Call<SpeciesByCategory> loadSpeciesByCategory(@Path("category") String category);

    @GET("species/id/{id}")
    Call<SpeciesById> loadSpeciesById(@Path("id") String id);
}