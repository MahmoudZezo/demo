package com.taj.model;

/**
 * Created by User on 9/16/2018.
 */
public class AreaModel {

    private int areaId;
    private String areaName;
    private String areaNameAr;

    public AreaModel(int areaId, String areaName, String areaNameAr) {
        this.areaId = areaId;
        this.areaName = areaName;
        this.areaNameAr = areaNameAr;
    }

    public AreaModel() {
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaNameAr() {
        return areaNameAr;
    }

    public void setAreaNameAr(String areaNameAr) {
        this.areaNameAr = areaNameAr;
    }


}
