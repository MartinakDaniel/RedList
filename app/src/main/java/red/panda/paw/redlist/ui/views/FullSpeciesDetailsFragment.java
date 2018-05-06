package red.panda.paw.redlist.ui.views;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import red.panda.paw.redlist.R;
import red.panda.paw.redlist.communication.models.SpeciesById;
import red.panda.paw.redlist.communication.services.RedListServiceController;
import red.panda.paw.redlist.config.component.ComponentRepository;
import red.panda.paw.redlist.ui.viewmodels.FullSpeciesDetailsViewModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Details view of the full species.
 */
public class FullSpeciesDetailsFragment extends Fragment {

    /**
     * The key ID for the species taxonomic ID.
     */
    public static final String SPECIES_TAXONOMIC_ID_KEY = "SPECIES_TAXONOMIC_ID_KEY";

    /**
     * The view model of the view.
     */
    private FullSpeciesDetailsViewModel fullSpeciesDetailsViewModel;

    @Inject
    protected RedListServiceController redListServiceController;

    public FullSpeciesDetailsFragment() {
        super();
        ComponentRepository.redListApplicationComponent().inject(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        final int speciesTaxonId = getArguments().getInt(SPECIES_TAXONOMIC_ID_KEY);
        fullSpeciesDetailsViewModel = ViewModelProviders.of(this).get(FullSpeciesDetailsViewModel.class);
        fullSpeciesDetailsViewModel.init(speciesTaxonId);

        //TEST
        redListServiceController.getSpeciesById(new Callback<SpeciesById>() {
            @Override
            public void onResponse(Call<SpeciesById> call, Response<SpeciesById> response) {
                final SpeciesById speciesById = response.body();
            }

            @Override
            public void onFailure(Call<SpeciesById> call, Throwable t) {

            }
        }, String.valueOf(speciesTaxonId));
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle
            savedInstanceState) {
        return inflater.inflate(R.layout.full_species_details_layout, container, false);
    }
}
