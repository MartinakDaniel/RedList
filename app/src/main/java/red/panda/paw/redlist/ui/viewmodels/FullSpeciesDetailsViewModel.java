package red.panda.paw.redlist.ui.viewmodels;

import android.arch.lifecycle.ViewModel;

import red.panda.paw.redlist.communication.models.Species;

/**
 * The view model for the full species details view.
 */
public class FullSpeciesDetailsViewModel extends ViewModel {

    /**
     * The taxonomic ID of the species.
     */
    private int speciesTaxonId;

    /**
     * The species.
     */
    private Species species;

    /**
     * Initializes the view model.
     *
     * @param speciesTaxonId the taxonomic ID of the species.
     */
    public void init(final int speciesTaxonId) {
        this.speciesTaxonId = speciesTaxonId;
    }

    /**
     * Gets the species.
     *
     * @return the species.
     */
    public Species getSpecies() {
        return species;
    }
}
