package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The list of the citations with the given spices ID.
 */
public class Citations {

    /**
     * The ID of the species.
     */
    @SerializedName("id")
    @Expose
    private String id;

    /**
     * The list of the citations.
     */
    @SerializedName("result")
    @Expose
    private List<Citation> citations = null;

    /**
     * Get the ID of the species.
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
     * Gets the list of the citations.
     *
     * @return the list of the citations.
     */
    public List<Citation> getCitations() {
        return citations;
    }

    /**
     * Sets the list of the citations.
     *
     * @param citations the list of the citations.
     */
    public void setCitations(@NonNull final List<Citation> citations) {
        this.citations = citations;
    }
}
