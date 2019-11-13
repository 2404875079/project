package com.qf.domain;

public class Report {
    private Integer r_id;
    private Integer r_uid;
    private Integer r_aid;
    private String r_content;
    private String r_date;

    @Override
    public String toString() {
        return "Report{" +
                "r_id=" + r_id +
                ", r_uid=" + r_uid +
                ", r_aid=" + r_aid +
                ", r_content='" + r_content + '\'' +
                ", r_date='" + r_date + '\'' +
                '}';
    }

    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

    public Integer getR_uid() {
        return r_uid;
    }

    public void setR_uid(Integer r_uid) {
        this.r_uid = r_uid;
    }

    public Integer getR_aid() {
        return r_aid;
    }

    public void setR_aid(Integer r_aid) {
        this.r_aid = r_aid;
    }

    public String getR_content() {
        return r_content;
    }

    public void setR_content(String r_content) {
        this.r_content = r_content;
    }

    public String getR_date() {
        return r_date;
    }

    public void setR_date(String r_date) {
        this.r_date = r_date;
    }
}
