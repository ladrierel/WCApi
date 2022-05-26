package net.wcapi.back.countryapi;

public class Ranking {

    private RankingItem rankingItem;
    private String previousPoints;
    private Tag tag;
    
    public RankingItem getRankingItem() {
        return rankingItem;
    }

    public void setRankingItem(RankingItem rankingItem) {
        this.rankingItem = rankingItem;
    }

    public String getPreviousPoints() {
        return previousPoints;
    }

    public void setPreviousPoints(String previousPoints) {
        this.previousPoints = previousPoints;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "{" +
                "rankingItem='" + rankingItem + '\'' +
                ", previousPoints='" + previousPoints + '\'' +
                ", tag='" + tag +
                "}";
    }
}