package com.jzhang.android.roompersistence_demo;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by jzhang on 2018/1/24.
 */

@Dao
public interface PersonDao {

    @Query("SELECT * FROM person")
    List<Person> getAll();

    @Query("SELECT * FROM person WHERE uid IN (:userIds)")
    List<Person> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM person WHERE first_name LIKE :first AND "
            + "last_name LIKE :last LIMIT 1")
    List<Person> findByName(String first, String last);

    @Insert
    void insertAll(Person... users);

    @Delete
    void delete(Person user);

}
