package net.wcapi.back.countryapi;

import java.util.List;

public class Rankings {

    private List<Ranking> rankings;
    
    public List<Ranking> getRankings() {
        return rankings;
    }

    public void setRankings(List<Ranking> rankings) {
        this.rankings = rankings;
    }


    @Override
    public String toString() {
        return "{" +
                "rankings='" + rankings + 
                "}";
    }
}