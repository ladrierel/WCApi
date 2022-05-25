package net.wcapi.back.countryapi;

public class Flag {

    private String src;
    private int width;
    private int height;
    private String title;
    private String alt;
    
    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    @Override
    public String toString() {
        return "{" +
                "src='" + src + '\'' +
                ", width='" + width + '\'' +
                ", height='" + height + '\'' +
                ", title='" + title + '\'' +
                ", alt=" + alt +
                '}';
    }
}