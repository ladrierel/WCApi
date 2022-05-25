package net.wcapi.back.countryapi;

public class Ranking {

    private long rank;
    private Flag flag;
    private String name;

    public long getRank() {
        return rank;
    }

    public void setRank(long rank) {
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

    @Override
    public String toString() {
        return "{" +
                "rank='" + rank + '\'' +
                ", flag='" + flag + '\'' +
                ", name=" + name +
                '}';
    }
}