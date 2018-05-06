package red.panda.paw.redlist.communication.models;

import android.support.annotation.NonNull;

/**
 * The category of the IUCN Red List.
 */
public class Category {

    public static final Category EX = new Category("EX", "Extinct");

    public static final Category EW = new Category("EW", "Extinct in the Wild");

    public static final Category CR = new Category("CR", "Critically Endangered");

    public static final Category EN = new Category("EN", "Endangered");

    public static final Category VU = new Category("VU", "Vulnerable");

    public static final Category NT = new Category("NT", "Near Threatened");

    public static final Category LC = new Category("LC", "Least Concern");

    public static final Category DD = new Category("DD", "Data Deficient");

    public static final Category LRlc = new Category("LRlc", "Lower Risk - least concern");

    public static final Category LRnt = new Category("LRnt", "Lower Risk - near threatened");

    public static final Category LRcd = new Category("LRnt", "Lower Risk - conservation dependent");

    /**
     * The abbreviation of the category.
     */
    private String abbreviation;

    /**
     * The name of the category.
     */
    private String name;

    /**
     * Private constructor fo the category class.
     *
     * @param abbreviation the abbreviation of the category.
     * @param name         the name of the category.
     */
    private Category(@NonNull final String abbreviation, @NonNull final String name) {
        this.abbreviation = abbreviation;
        this.name = name;
    }

    /**
     * Returns the abbreviation of the category.
     *
     * @return the abbreviation.
     */
    @NonNull
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Returns the name of the category.
     *
     * @return the name of the category.
     */
    @NonNull
    public String getName() {
        return name;
    }
}
