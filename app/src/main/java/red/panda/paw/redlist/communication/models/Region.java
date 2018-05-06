package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

/**
 * The region class
 */
public class Region {

    /**
     * The name of the region. It's readable for human.
     */
    @SerializedName("name")
    private String name;

    /**
     * The identifier of the region.
     */
    @SerializedName("identifier")
    private String identifier;

    /**
     * Gets the name of the region.
     *
     * @return the name of the region.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the region.
     *
     * @param name the name of the region.
     */
    public void setName(@NonNull final String name) {
        this.name = name;
    }

    /**
     * Gets the identifier of the region.
     *
     * @return the identifier of the region.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the identifier of the region
     *
     * @param identifier the identifier of the region.
     */
    public void setIdentifier(@NonNull final String identifier) {
        this.identifier = identifier;
    }
}
