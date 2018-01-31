package com.openclassrooms.netapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by michel on 30/01/2018.
 */

public class Result {

    @SerializedName("title")
    @Expose
    public String title;

    public Result(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
