package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The citation of the species.
 */
public class Citation {

    /**
     * The citation.
     */
    @SerializedName("citation")
    @Expose
    private String citation;

    /**
     * Gets the citation.
     *
     * @return the citation.
     */
    public String getCitation() {
        return citation;
    }

    /**
     * Sets the citation.
     *
     * @param citation the citation.
     */
    public void setCitation(@NonNull final String citation) {
        this.citation = citation;
    }
}
