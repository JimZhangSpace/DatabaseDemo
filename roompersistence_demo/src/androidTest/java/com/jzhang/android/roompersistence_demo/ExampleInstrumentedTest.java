package com.jzhang.android.roompersistence_demo;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    private PersonDao mPersonDao;
    private AppDatabase mDb;

    @Before
    public void createDb() {
        Context context = InstrumentationRegistry.getTargetContext();
        mDb = Room.inMemoryDatabaseBuilder(context, AppDatabase.class).build();
        mPersonDao = mDb.personDao();

    }

    @After
    public void closeDb() {
        mDb.close();
    }

    @Test
    public void writeUserAndReadInList() throws Exception {
        Person user = TestUtil.createUser();
        user.setFirstName("george");
        user.setLastName("paul");
        mPersonDao.insertAll(user);
        List<Person> byName = mPersonDao.findByName("george","paul");
        assertThat(byName.get(0).getFirstName(), equalTo(user.getFirstName()));
    }
        @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.jzhang.android.roompersistence_demo.test", appContext.getPackageName());
    }


}
