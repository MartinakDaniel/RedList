package red.panda.paw.redlist.communication.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The countries object.
 */
public class Countries {

    /**
     * The numbers of the countries.
     */
    @SerializedName("count")
    private int count;

    /**
     * The list of the countries.
     */
    @SerializedName("results")
    private List<Country> countries;

    /**
     * Gets the list of the countries.
     *
     * @return the list of the countries.
     */
    public List<Country> getCountries() {
        return countries;
    }

    /**
     * Sets the list of the countries.
     *
     * @param countries the list of the countries.
     */
    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    /**
     * Gets the count of the country list from the response.
     *
     * @return the count of the country list.
     */
    public int getCount() {
        return count;
    }

    /**
     * Sets the count of the country list.
     *
     * @param count the count of the country list.
     */
    public void setCount(int count) {
        this.count = count;
    }
}
