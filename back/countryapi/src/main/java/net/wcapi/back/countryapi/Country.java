package net.wcapi.back.countryapi;

public class Country {

	private final String countryName;
    private final String countryCode;
    private final String countryFlagPath;
    private final int countryRank;

	public Country(String countryName, String countryCode, String countryFlagPath, int countryRank) {
		this.countryName = countryName;
		this.countryCode = countryCode;
        this.countryFlagPath = countryFlagPath;
        this.countryRank = countryRank;
	}


    public String getName() {
        return countryName;
    }

    public String getCode() {
        return countryCode;
    }

    public String getFlagPath() {
        return countryFlagPath;
    }

    public int getRank() {
        return countryRank;
    }


}