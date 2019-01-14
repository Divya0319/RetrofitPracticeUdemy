package com.practice.retrofitexampleudemy.http.apimodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserModel {

    @SerializedName("NAME")
    @Expose
    private String nAME;
    @SerializedName("AGE")
    @Expose
    private Integer aGE;
    @SerializedName("URL")
    @Expose
    private String uRL;

    public String getNAME() {
        return nAME;
    }

    public void setNAME(String nAME) {
        this.nAME = nAME;
    }

    public Integer getAGE() {
        return aGE;
    }

    public void setAGE(Integer aGE) {
        this.aGE = aGE;
    }

    public String getURL() {
        return uRL;
    }

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

}