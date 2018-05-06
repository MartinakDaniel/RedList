package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The list of the species by ID.
 */
public class SpeciesById {

    /**
     * The ID of the species.
     */
    @SerializedName("name")
    private String id;

    /**
     * The list of the species.
     */
    @SerializedName("result")
    private List<Species> speciesList;

    /**
     * Gets the ID of the species.
     *
     * @return the ID of the species.
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the ID of the species.
     *
     * @param id the ID of the species.
     */
    public void setId(@NonNull final String id) {
        this.id = id;
    }

    /**
     * Gets the list of the species.
     *
     * @return the list of the species.
     */
    public List<Species> getSpeciesList() {
        return speciesList;
    }

    /**
     * Sets the list of the species.
     *
     * @param speciesList the list of the species.
     */
    public void setSpeciesList(@NonNull final List<Species> speciesList) {
        this.speciesList = speciesList;
    }
}
