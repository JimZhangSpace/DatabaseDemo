package com.jzhang.android.dbflow_demo.model;

import com.jzhang.android.dbflow_demo.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import java.util.UUID;

/**
 * Created by jzhang on 2018/1/22.
 */

@Table(database = AppDatabase.class)
public class User {
    @PrimaryKey // at least one primary key required
    public UUID id;

    @Column
    public String name;

    @Column
    public int age;
}
