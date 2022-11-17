package es.euroformac.javaee.model;

public class News {

    private long id;
    private String title;
    private String subTitle;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    @Override
    public String toString() {
        return "News{" + "id=" + id + ", title='" + title + '\'' + ", subTitle='" + subTitle + '\'' + ", text='" + text + '\'' + '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public News(long id, String title, String subTitle, String text) {
        this.id = id; this.title = title; this.subTitle = subTitle; this.text = text;
    }

    public News() {
    }

    private String text;
}
