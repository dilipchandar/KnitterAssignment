package com.example.knitterassignment.database;

import com.example.knitterassignment.model.Result;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface ResultDao {

    @Query("SELECT * FROM result")
    List<Result> getAll();

    @Insert
    void insertAll(Result result);

    @Delete
    void delete(Result result);

}
