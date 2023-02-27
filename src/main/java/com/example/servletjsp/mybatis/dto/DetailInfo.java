package com.example.servletjsp.mybatis.dto;

public class DetailInfo {

    private String cotId;
    private String fieldGubun;
    private String displayTitle;
    private String contentBody;
    private String serialNum;

    @Override
    public String toString() {
        return "DetailInfo{" +
                "cotId='" + cotId + '\'' +
                ", fieldGubun='" + fieldGubun + '\'' +
                ", displayTitle='" + displayTitle + '\'' +
                ", contentBody='" + contentBody + '\'' +
                ", serialNum='" + serialNum + '\'' +
                '}';
    }

    public void setCotId(String cotId) {
        this.cotId = cotId;
    }

    public void setFieldGubun(String fieldGubun) {
        this.fieldGubun = fieldGubun;
    }

    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    public void setContentBody(String contentBody) {
        this.contentBody = contentBody;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getCotId() {
        return cotId;
    }

    public String getFieldGubun() {
        return fieldGubun;
    }

    public String getDisplayTitle() {
        return displayTitle;
    }

    public String getContentBody() {
        return contentBody;
    }

    public String getSerialNum() {
        return serialNum;
    }
}
