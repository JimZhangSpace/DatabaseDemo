package com.jzhang.android.roompersistence_demo;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by jzhang on 2018/3/5.
 */

@Database(entities = {Person.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {

    public abstract PersonDao personDao();
}
