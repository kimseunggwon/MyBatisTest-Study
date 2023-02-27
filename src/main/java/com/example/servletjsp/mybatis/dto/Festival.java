package com.example.servletjsp.mybatis.dto;

import org.mariadb.jdbc.type.LineString;

import java.util.List;

public class Festival {

    private String cotId;
    private String title;
    private int contentStatus;
    private int contentType;
    private String createDate;

    private List<DetailInfo> detailInfoList;

    @Override
    public String toString() {
        return "Festival{" +
                "cotId='" + cotId + '\'' +
                ", title='" + title + '\'' +
                ", contentStatus=" + contentStatus +
                ", contentType=" + contentType +
                ", createDate='" + createDate + '\'' +
                ", detailInfoList=" + detailInfoList +
                '}';
    }

    public void setCotId(String cotId) {
        this.cotId = cotId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContentStatus(int contentStatus) {
        this.contentStatus = contentStatus;
    }

    public void setContentType(int contentType) {
        this.contentType = contentType;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public void setDetailInfoList(List<DetailInfo> detailInfoList) {
        this.detailInfoList = detailInfoList;
    }

    public String getCotId() {
        return cotId;
    }

    public String getTitle() {
        return title;
    }

    public int getContentStatus() {
        return contentStatus;
    }

    public int getContentType() {
        return contentType;
    }

    public String getCreateDate() {
        return createDate;
    }

    public List<DetailInfo> getDetailInfoList() {
        return detailInfoList;
    }
}
