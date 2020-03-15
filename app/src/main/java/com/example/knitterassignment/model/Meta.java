package com.example.knitterassignment.model;

import com.google.gson.annotations.SerializedName;

public class Meta {

    @SerializedName("success")
    private boolean success;

    @SerializedName("code")
    private int code;

    @SerializedName("message")
    private String message;

    @SerializedName("totalCount")
    private int totalCount;

    @SerializedName("pageCount")
    private int pageCount;

    @SerializedName("currentPage")
    private int currentPage;

    @SerializedName("perPage")
    private int perPage;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPerPage() {
        return perPage;
    }

    public void setPerPage(int perPage) {
        this.perPage = perPage;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [pageCount = "+pageCount+", code = "+code+", perPage = "+perPage+", success = "+success+", message = "+message+", totalCount = "+totalCount+", currentPage = "+currentPage+"]";
    }

}
