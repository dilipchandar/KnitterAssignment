package com.example.knitterassignment.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("_meta")
    private Meta _meta;

    @SerializedName("result")
    private List<Result> result;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Meta get_meta ()
    {
        return _meta;
    }

    public void set_meta (Meta _meta)
    {
        this._meta = _meta;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [result = "+result+", _meta = "+_meta+"]";
    }
}
