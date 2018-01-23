package com.jzhang.android.dbflow_demo.model;

import com.jzhang.android.dbflow_demo.AppDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.UUID;

/**
 * Created by jzhang on 2018/1/22.
 */

@Table(database = AppDatabase.class)
public class Bill extends BaseModel {

    @PrimaryKey
    public UUID id;

    @Column
    public String name;

    @Column
    public int cost;
}
