package com.jzhang.android.databasedemo;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.jzhang.android.dbflow_demo.model.Bill;
import com.jzhang.android.dbflow_demo.model.User;
import com.jzhang.android.sqlitehelper_demo.FeedReaderContract;
import com.jzhang.android.sqlitehelper_demo.SqlteDBDemoOpenHelper;
import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.structure.ModelAdapter;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sqliteopenHelperTest();

    }

    private void dbflowTest() {

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

    private void sqliteopenHelperTest() {
        SqlteDBDemoOpenHelper helper = new SqlteDBDemoOpenHelper(this);
        SQLiteDatabase database = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_TITLE,"Three kingdom");
        values.put(FeedReaderContract.FeedEntry.COLUMN_NAME_SUBTITLE,"First Chapter");
        database.insert(FeedReaderContract.FeedEntry.TABLE_NAME,null,values);
    }
}
