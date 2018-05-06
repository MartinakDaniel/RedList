package red.panda.paw.redlist.communication.models;

import com.google.gson.annotations.SerializedName;

/**
 * The species class with full information.
 */
public class Species {

    @SerializedName("taxonid")
    private int taxonid;

    @SerializedName("scientific_name")
    private String scientificName;

    private String kingdom;

    @SerializedName("phylum")
    private String phylum;

    @SerializedName("class")
    private String animalClass;

    @SerializedName("order")
    private String order;

    @SerializedName("family")
    private String family;

    @SerializedName("genus")
    private String genus;

    @SerializedName("main_common_name")
    private String mainCommonName;

    @SerializedName("authority")
    private String authority;

    @SerializedName("published_year")
    private int publishedYear;

    @SerializedName("category")
    private String category;

    @SerializedName("criteria")
    private String criteria;

    @SerializedName("marine_system")
    private boolean marineSystem;

    @SerializedName("freshwater_system")
    private boolean freshwaterSystem;

    @SerializedName("terrestrial_system")
    private boolean terrestrialSystem;

    @SerializedName("assessor")
    private String assessor;

    @SerializedName("reviewer")
    private String reviewer;

    @SerializedName("aoo_km2")
    private String aooKm2;

    @SerializedName("eoo_km2")
    private String eooKm2;

    @SerializedName("elevation_upper")
    private String elevationUpper;

    @SerializedName("elevation_lower")
    private String elevationLower;

    @SerializedName("depth_upper")
    private String depthUpper;

    @SerializedName("depth_lower")
    private String depthLower;

    @SerializedName("errata_flag")
    private String errataFlag;

    @SerializedName("errata_reason")
    private String errataReason;

    @SerializedName("amended_flag")
    private String amendedFlag;

    @SerializedName("amended_reason")
    private String amendedReason;

    public int getTaxonid() {
        return taxonid;
    }

    public void setTaxonid(int taxonid) {
        this.taxonid = taxonid;
    }

    public String getScientificName() {
        return scientificName;
    }

    public void setScientificName(String scientificName) {
        this.scientificName = scientificName;
    }

    public String getKingdom() {
        return kingdom;
    }

    public void setKingdom(String kingdom) {
        this.kingdom = kingdom;
    }

    public String getPhylum() {
        return phylum;
    }

    public void setPhylum(String phylum) {
        this.phylum = phylum;
    }

    public String getAnimalClass() {
        return animalClass;
    }

    public void setAnimalClass(String animalClass) {
        this.animalClass = animalClass;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getGenus() {
        return genus;
    }

    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getMainCommonName() {
        return mainCommonName;
    }

    public void setMainCommonName(String mainCommonName) {
        this.mainCommonName = mainCommonName;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCriteria() {
        return criteria;
    }

    public void setCriteria(String criteria) {
        this.criteria = criteria;
    }

    public boolean isMarineSystem() {
        return marineSystem;
    }

    public void setMarineSystem(boolean marineSystem) {
        this.marineSystem = marineSystem;
    }

    public boolean isFreshwaterSystem() {
        return freshwaterSystem;
    }

    public void setFreshwaterSystem(boolean freshwaterSystem) {
        this.freshwaterSystem = freshwaterSystem;
    }

    public boolean isTerrestrialSystem() {
        return terrestrialSystem;
    }

    public void setTerrestrialSystem(boolean terrestrialSystem) {
        this.terrestrialSystem = terrestrialSystem;
    }

    public String getAssessor() {
        return assessor;
    }

    public void setAssessor(String assessor) {
        this.assessor = assessor;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getAooKm2() {
        return aooKm2;
    }

    public void setAooKm2(String aooKm2) {
        this.aooKm2 = aooKm2;
    }

    public String getEooKm2() {
        return eooKm2;
    }

    public void setEooKm2(String eooKm2) {
        this.eooKm2 = eooKm2;
    }

    public String getElevationUpper() {
        return elevationUpper;
    }

    public void setElevationUpper(String elevationUpper) {
        this.elevationUpper = elevationUpper;
    }

    public String getElevationLower() {
        return elevationLower;
    }

    public void setElevationLower(String elevationLower) {
        this.elevationLower = elevationLower;
    }
}
