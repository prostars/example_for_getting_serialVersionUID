package com.company;

import java.io.Serializable;
import java.util.Date;

public class SomeData implements Serializable {

    public SomeData(final int key, final String value, final Date date) {
        this.key = key;
        this.value = value;
        this.date = date;
    }

    public int key;
    public String value;
    public Date date;
//    public Boolean enable;
}
