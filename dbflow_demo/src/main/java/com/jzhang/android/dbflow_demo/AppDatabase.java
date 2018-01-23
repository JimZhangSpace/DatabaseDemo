package com.jzhang.android.dbflow_demo;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by jzhang on 2018/1/19.
 */

@Database(name = AppDatabase.NAME, version = AppDatabase.VERSION)

public class AppDatabase {
    public static final String NAME = "AppDatabase";

    public static final int VERSION = 2;
}
