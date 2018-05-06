package red.panda.paw.redlist;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import red.panda.paw.redlist.communication.models.Countries;
import red.panda.paw.redlist.communication.models.Country;
import red.panda.paw.redlist.communication.models.Regions;
import red.panda.paw.redlist.communication.models.SpeciesCount;
import red.panda.paw.redlist.communication.services.RedListServiceController;
import red.panda.paw.redlist.ui.views.FullSpeciesDetailsFragment;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    /**
     * The {@link RedListServiceController} instance.
     */
    protected RedListServiceController redListServiceController;

    /**
     * The list of the countries.
     */
    protected List<Country> countryList;

    /**
     * The {@link Countries} response.
     */
    protected Countries countries;

    /**
     * Callback for the {@link RedListServiceController#getCountries(Callback)} method. It handles the response and
     * the error too.
     */
    protected Callback<Countries> countriesCallback = new Callback<Countries>() {
        @Override
        public void onResponse(Call<Countries> call, Response<Countries> response) {
            final int responseCode = response.code();
            if (responseCode == HttpsURLConnection.HTTP_OK) {
                countries = response.body();
                updateCountries();
                showToastMessage("Countries number" + countryList.size());
                return;
            }
            showToastMessage("The response has failed. HTML status code:" + response.code());
        }

        @Override
        public void onFailure(Call<Countries> call, Throwable t) {
            Toast.makeText(MainActivity.this, "Failed to load the countries!", Toast.LENGTH_SHORT).show();
        }
    };

    protected Callback<SpeciesCount> globalSpeciesCountCallback = new Callback<SpeciesCount>() {
        @Override
        public void onResponse(Call<SpeciesCount> call, Response<SpeciesCount> response) {
            final int count = response.body().getCount();
            showToastMessage("Global species count:" + count);
        }

        @Override
        public void onFailure(Call<SpeciesCount> call, Throwable t) {

        }
    };


    protected Callback<SpeciesCount> regionalSpeciesCountCallback = new Callback<SpeciesCount>() {
        @Override
        public void onResponse(Call<SpeciesCount> call, Response<SpeciesCount> response) {
            final int count = response.body().getCount();
            showToastMessage("Regional species count:" + count);
        }

        @Override
        public void onFailure(Call<SpeciesCount> call, Throwable t) {

        }
    };

    protected Callback<Regions> regionsCallback = new Callback<Regions>() {
        @Override
        public void onResponse(Call<Regions> call, Response<Regions> response) {
            final int count = response.body().getCount();
            showToastMessage("Regions count:" + count);
        }

        @Override
        public void onFailure(Call<Regions> call, Throwable t) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FullSpeciesDetailsFragment fullSpeciesDetailsFragment = new FullSpeciesDetailsFragment();
        final Bundle bundle = new Bundle();
        bundle.putInt(FullSpeciesDetailsFragment.SPECIES_TAXONOMIC_ID_KEY, 1234);
        fullSpeciesDetailsFragment.setArguments(bundle);
        final FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fullSpeciesDetailsFragment);
        fragmentTransaction.commit();

//        if (redListServiceController == null) {
//            redListServiceController = new RedListServiceController(getString(R.string.red_list_api_token_key));
//        }
//
//        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                redListServiceController.getCountries(countriesCallback);
//                redListServiceController.getGlobalSpeciesCount(globalSpeciesCountCallback);
//                redListServiceController.getRegionalSpeciesCount(regionalSpeciesCountCallback, "europe");
//                redListServiceController.getRegions(regionsCallback);
//            }
//        });
    }

    /**
     * Updates the country's views.
     */
    protected void updateCountries() {
        countryList = countries.getCountries();
    }

    /**
     * Shows the given message in a toast.
     *
     * @param message the message.
     */
    protected void showToastMessage(@NonNull final String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
