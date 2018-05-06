package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The regions class with the list of the regions.
 */
public class Regions {

    /**
     * The numbers of the regions.
     */
    @SerializedName("count")
    private int count;

    /**
     * The list of the regions.
     */
    @SerializedName("results")
    private List<Region> regions;

    /**
     * Gets the count of the regions.
     *
     * @return the count of the regions.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the count of the regions.
     *
     * @param count the count of the regions.
     */
    public void setCount(final int count) {
        this.count = count;
    }

    /**
     * Gets the list of the regions.
     *
     * @return the list of the regions.
     */
    public List<Region> getRegions() {
        return regions;
    }

    /**
     * Sets the list of the regions.
     *
     * @param regions the list of the regions.
     */
    public void setRegions(@NonNull final List<Region> regions) {
        this.regions = regions;
    }
}
