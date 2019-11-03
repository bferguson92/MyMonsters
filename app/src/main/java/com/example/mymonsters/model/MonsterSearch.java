
package com.example.mymonsters.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MonsterSearch {


    @SerializedName("results")
    @Expose
    private List<Result> results = null;


    public List<Result> getResults() {
        return results;
    }

}
