package com.sensorberg.realm_javawriter_dup;

import io.realm.RealmObject;

public class Foo extends RealmObject {
    private String bar;

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }
}
