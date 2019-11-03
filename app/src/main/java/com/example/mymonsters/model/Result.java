
package com.example.mymonsters.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {


    @SerializedName("name")
    @Expose
    private String name;

    public String getName() {
        return name;
    }

}
