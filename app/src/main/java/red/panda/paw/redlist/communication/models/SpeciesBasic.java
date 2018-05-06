package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * The basic species class.
 */
public class SpeciesBasic {

    /**
     * The Taxonomic identifier of the species.
     *
     * @see <a href=https://www.uniprot.org/help/taxonomic_identifier>Taxonomic identifier</a>
     */
    @SerializedName("taxonid")
    @Expose
    private int taxonId;

    /**
     * The scientific name of the species.
     */
    @SerializedName("scientific_name")
    @Expose
    private String scientificName;

    /**
     * The subspecies of the species.
     */
    @SerializedName("subspecies")
    @Expose
    private Object subspecies;

    /**
     * The rank of the species.
     */
    @SerializedName("rank")
    @Expose
    private Object rank;

    /**
     * The sub population of the species.
     */
    @SerializedName("subpopulation")
    @Expose
    private Object subpopulation;

    /**
     * Returns the taxonomic identifier of the species.
     *
     * @return the taxonomic identifier of the species.
     */
    public int getTaxonid() {
        return taxonId;
    }

    /**
     * Sets the taxonomic identifier of the species
     *
     * @param taxonId the taxonomic identifier of the species
     */
    public void setTaxonid(final int taxonId) {
        this.taxonId = taxonId;
    }

    /**
     * Return the scientific name of the species.
     *
     * @return the scientific name of the species.
     */
    public String getScientificName() {
        return scientificName;
    }

    /**
     * Sets the scientific name of the species.
     *
     * @param scientificName the scientific name of the species.
     */
    public void setScientificName(@NonNull final String scientificName) {
        this.scientificName = scientificName;
    }

    /**
     * Return the subspecies of the species.
     *
     * @return the subspecies of the species.
     */
    public Object getSubspecies() {
        return subspecies;
    }

    /**
     * Sets the subspecies of the species.
     *
     * @param subspecies the subspecies of the species.
     */
    public void setSubspecies(Object subspecies) {
        this.subspecies = subspecies;
    }

    /**
     * Return the rank of the species.
     *
     * @return the rank of the species.
     */
    public Object getRank() {
        return rank;
    }

    /**
     * Sets the rank of the species.
     *
     * @param rank the rank of the species.
     */
    public void setRank(Object rank) {
        this.rank = rank;
    }

    public Object getSubpopulation() {
        return subpopulation;
    }

    public void setSubpopulation(Object subpopulation) {
        this.subpopulation = subpopulation;
    }
}
