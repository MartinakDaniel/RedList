package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The list of the basic species in the given category.
 */
public class SpeciesByCategory {

    /**
     * The count of the basic species.
     */
    @SerializedName("count")
    @Expose
    private int count;

    /**
     * The ID of the category
     */
    @SerializedName("category")
    @Expose
    private String category;

    /**
     * The list of the basic species in the category.
     */
    @SerializedName("result")
    @Expose
    private List<SpeciesBasic> speciesBasics = null;

    /**
     * Returns the count of the basic species.
     *
     * @return the count of the basic species.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the count of the basic species.
     *
     * @param count the count of the basic species.
     */
    public void setCount(final int count) {
        this.count = count;
    }

    /**
     * Returns the category.
     *
     * @return the category.
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the category.
     *
     * @param category the category.
     */
    public void setCategory(@NonNull final String category) {
        this.category = category;
    }

    /**
     * Returns the list of the basic species.
     *
     * @return the list of the basic species.
     */
    public List<SpeciesBasic> getSpeciesBasics() {
        return speciesBasics;
    }

    /**
     * Sets the list of the basic species.
     *
     * @param speciesBasics the list of the basic species.
     */
    public void setSpeciesBasics(@NonNull final List<SpeciesBasic> speciesBasics) {
        this.speciesBasics = speciesBasics;
    }
}
