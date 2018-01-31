package com.openclassrooms.netapp.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import javax.xml.transform.Result;

/**
 * Created by Philippe on 20/12/2017.
 */

public class GithubUser {

    @SerializedName("results")
    @Expose
    public List<Result> results = null;

    @SerializedName("title")
    @Expose
    public String title;

    public GithubUser(List<Result> results) {
        this.results = results;
    }

    public List<Result> getResults() {
        return results;
    }
}
