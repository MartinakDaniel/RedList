package red.panda.paw.redlist.communication.models;

import com.google.gson.annotations.SerializedName;

/**
 * The country class.
 */
public class Country {

    /**
     * The ISO code of the country.
     */
    @SerializedName("isocode")
    private String ISOCode;

    /**
     * The name of the country.
     */
    private String country;

    /**
     * Gets the ISO code of the country.
     *
     * @return the ISO code of the country.
     */
    public String getISOCode() {
        return ISOCode;
    }

    /**
     * Sets teh ISO code of the country.
     *
     * @param ISOCode the ISO code of the country.
     */
    public void setISOCode(final String ISOCode) {
        this.ISOCode = ISOCode;
    }

    /**
     * Gets the country's name.
     *
     * @return  the country's name.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the county's name.
     *
     * @param country the country's name.
     */
    public void setCountry(final String country) {
        this.country = country;
    }
}
