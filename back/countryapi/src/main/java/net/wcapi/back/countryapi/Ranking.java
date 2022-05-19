package net.wcapi.back.countryapi;

import java.util.Map;

public class Ranking {

    private long rank;
    private Map<String, Object> flag;
    private String name;

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
        this.rank = rank;
    }

    public Map<String, Object> getFlag() {
        return flag;
    }

    public void setFlag(Map<String, Object> flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "rank='" + rank + '\'' +
                ", flag='" + flag + '\'' +
                ", flag - src='" + flag.get("src") +'\'' +
                ", name=" + name +
                '}';
    }
}