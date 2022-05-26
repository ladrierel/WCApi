package net.wcapi.back.countryapi;

public class RankingItem {

    private int rank;
    private Flag flag;
    private String name;
    private long totalPoints;
    private boolean active;
    private int previousRank;
    private String countryURL;
    private String countryCode;

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Flag getFlag() {
        return flag;
    }

    public void setFlag(Flag flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(long totalPoints) {
        this.totalPoints = totalPoints;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getPreviousRank() {
        return previousRank;
    }

    public void setPreviousRank(int previousRank) {
        this.previousRank = previousRank;
    }

    public String getCountryURL() {
        return countryURL;
    }

    public void setCountryURL(String countryURL) {
        this.countryURL = countryURL;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "{" +
                "rank='" + rank + '\'' +
                ", flag='" + flag + '\'' +
                ", name='" + name + '\'' +
                ", totalPoints='" + totalPoints + '\'' +
                ", active='" + active + '\'' +
                ", previousRank='" + previousRank + '\'' +
                ", countryURL='" + countryURL + '\'' +
                ", countryCode='" + countryCode + 
                "}";
    }
}