package com.jzhang.android.databasedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jzhang.android.dbflow_demo.model.Bill;
import com.jzhang.android.dbflow_demo.model.User;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User user = new User();
        user.id = UUID.randomUUID();
        user.name = "Andrew Grosner";
        user.age = 27;

        ModelAdapter<User> adapter = FlowManager.getModelAdapter(User.class);
        adapter.insert(user);

        Bill bill = new Bill();
        bill.id = UUID.randomUUID();
        bill.name = "Bread";
        bill.cost = 5;
        bill.insert();

    }
}
