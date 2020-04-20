package com.company;

import java.io.*;

public class ReadOnly {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("file.dat"))) {
            SomeData deserialized = (SomeData) ois.readObject();
            System.out.printf("deserialized someData = { key: %d, value: %s, date: %tA %<tB %<te %<tY %<tR:%<tS.%<tL }\n", deserialized.key, deserialized.value, deserialized.date);
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
