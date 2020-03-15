package com.example.knitterassignment.model;

import com.google.gson.annotations.SerializedName;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "result")
public class Result {

    @PrimaryKey(autoGenerate = true)
    private int uid;

    @ColumnInfo(name = "id")
    @SerializedName("id")
    private String id;

    @ColumnInfo(name = "first_name")
    @SerializedName("first_name")
    private String first_name;

    @ColumnInfo(name = "last_name")
    @SerializedName("last_name")
    private String last_name;

    @ColumnInfo(name = "gender")
    @SerializedName("gender")
    private String gender;

    private String dob;

    @SerializedName("website")
    private String website;

    private String address;

    private String phone;

    private String email;

    private String status;

    public String getWebsite ()
    {
        return website;
    }

    public void setWebsite (String website)
    {
        this.website = website;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getGender ()
    {
        return gender;
    }

    public void setGender (String gender)
    {
        this.gender = gender;
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (String phone)
    {
        this.phone = phone;
    }

    public String getDob ()
    {
        return dob;
    }

    public void setDob (String dob)
    {
        this.dob = dob;
    }

    public String getLast_name ()
    {
        return last_name;
    }

    public void setLast_name (String last_name)
    {
        this.last_name = last_name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getFirst_name ()
    {
        return first_name;
    }

    public void setFirst_name (String first_name)
    {
        this.first_name = first_name;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [website = "+website+", address = "+address+", gender = "+gender+", phone = "+phone+", dob = "+dob+", last_name = "+last_name+", id = "+id+", first_name = "+first_name+", email = "+email+", status = "+status+"]";
    }

}
