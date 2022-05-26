package net.wcapi.back.countryapi;

import java.util.List;

public class Rankings {

    private List<RankingItem> rankings;
    
    public List<RankingItem> getRankings() {
        return rankings;
    }

    public void setRankings(List<RankingItem> rankings) {
        this.rankings = rankings;
    }


    @Override
    public String toString() {
        return "{" +
                "rankings='" + rankings + 
                "}";
    }
}