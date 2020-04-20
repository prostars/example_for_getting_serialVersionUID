package com.company;

import java.io.*;
import java.util.Date;

public class WriteAndRead {
    public static void main(String[] args) {
        SomeData someData = new SomeData(1, "first", new Date());
        System.out.printf("someData = { key: %d, value: %s, date: %tA %<tB %<te %<tY %<tR:%<tS.%<tL }\n", someData.key, someData.value, someData.date);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("file.dat"));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.dat"))) {
            oos.writeObject(someData);
            SomeData deserialized = (SomeData) ois.readObject();
            System.out.printf("deserialized someData = { key: %d, value: %s, date: %tA %<tB %<te %<tY %<tR:%<tS.%<tL }\n", deserialized.key, deserialized.value, deserialized.date);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } 
    }
}
