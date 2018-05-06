package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

/**
 * The count of the species.
 */
public class SpeciesCount {

    /**
     * The count of the species.
     */
    @SerializedName("count")
    private int count;

    /**
     * The region identifier. If it's {@link null} that means it's a global data.
     */
    @SerializedName("region_identifier")
    private String regionIdentifier;

    /**
     * The note of this data.
     */
    @SerializedName("note")
    private String note;

    /**
     * Gets the count of the species.
     *
     * @return the count of the species.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the count of the species.
     *
     * @param count the count of the species.
     */
    public void setCount(final int count) {
        this.count = count;
    }

    /**
     * Gets the region code of the species count.
     *
     * @return the region code.
     */
    @Nullable
    public String getRegionIdentifier() {
        return regionIdentifier;
    }

    /**
     * Sets the region code of the species count.
     *
     * @param regionIdentifier the region code of the species count.
     */
    public void setRegionIdentifier(@Nullable final String regionIdentifier) {
        this.regionIdentifier = regionIdentifier;
    }

    /**
     * Gets the note of the data.
     *
     * @return the note of the data.
     */
    @NonNull
    public String getNote() {
        return note;
    }

    /**
     * Sets the note of the data.
     *
     * @param note the note of the data.
     */
    public void setNote(@NonNull final String note) {
        this.note = note;
    }

}
