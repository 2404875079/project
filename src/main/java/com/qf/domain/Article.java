package com.qf.domain;

public class Article {
    private Integer a_id;
    private Integer a_uid;
    private Integer a_mid;
    private String a_headline;
    private String a_content;
    private String a_date;
    private Integer a_lookCount;

    private User user;
    private Motif motif;

    public Motif getMotif() {
        return motif;
    }

    public void setMotif(Motif motif) {
        this.motif = motif;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Article{" +
                "a_id=" + a_id +
                ", a_uid=" + a_uid +
                ", a_mid=" + a_mid +
                ", a_headline='" + a_headline + '\'' +
                ", a_content='" + a_content + '\'' +
                ", a_date='" + a_date + '\'' +
                ", a_lookCount=" + a_lookCount +
                '}';
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public Integer getA_uid() {
        return a_uid;
    }

    public void setA_uid(Integer a_uid) {
        this.a_uid = a_uid;
    }

    public Integer getA_mid() {
        return a_mid;
    }

    public void setA_mid(Integer a_mid) {
        this.a_mid = a_mid;
    }

    public String getA_headline() {
        return a_headline;
    }

    public void setA_headline(String a_headline) {
        this.a_headline = a_headline;
    }

    public String getA_content() {
        return a_content;
    }

    public void setA_content(String a_content) {
        this.a_content = a_content;
    }

    public String getA_date() {
        return a_date;
    }

    public void setA_date(String a_date) {
        this.a_date = a_date;
    }

    public Integer getA_lookCount() {
        return a_lookCount;
    }

    public void setA_lookCount(Integer a_lookCount) {
        this.a_lookCount = a_lookCount;
    }
}
