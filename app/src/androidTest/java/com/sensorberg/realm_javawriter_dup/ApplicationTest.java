package com.sensorberg.realm_javawriter_dup;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.fest.assertions.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.realm.Realm;
import io.realm.RealmResults;

@RunWith(AndroidJUnit4.class)
public class ApplicationTest  {
    private Realm realm;


    @Before
    public void setupTest(){

        realm = Realm.getInstance(InstrumentationRegistry.getContext(), "realm-" + System.currentTimeMillis() + ".realm");
    }

    @Test
    public void something() throws Exception {

        realm.beginTransaction();
        Foo foo = realm.createObject(Foo.class);
        foo.setBar("foo");
        realm.commitTransaction();

        RealmResults<Foo> all = realm.allObjects(Foo.class);

        Assertions.assertThat(all.size()).isEqualTo(1);

    }
}