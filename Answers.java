package com.zb.entity;

import java.util.Date;

public class Answers {
    private Integer id;
    private String ansContent;
    private Date ansDate;
    private Integer qid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnsContent() {
        return ansContent;
    }

    public void setAnsContent(String ansContent) {
        this.ansContent = ansContent;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "id=" + id +
                ", ansContent='" + ansContent + '\'' +
                ", ansDate=" + ansDate +
                ", qid=" + qid +
                '}';
    }

    public Date getAnsDate() {
        return ansDate;
    }

    public void setAnsDate(Date ansDate) {
        this.ansDate = ansDate;
    }

    public Integer getQid() {
        return qid;
    }

    public void setQid(Integer qid) {
        this.qid = qid;
    }
}
