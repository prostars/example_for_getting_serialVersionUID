package com.company;

import java.io.ObjectStreamClass;

public class PrintSerialVersionUID {
    public static void main(String[] args) {
        long serialVersionUID = ObjectStreamClass.lookup(SomeData.class).getSerialVersionUID();
        System.out.printf("serialVersionUID: %d\n", serialVersionUID);
    }
}
