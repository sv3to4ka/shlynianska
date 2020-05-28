package com.first;

import java.util.ArrayList;
import java.util.List;

public class Application5 {
    public static void main(String[] args) {
        //catch Exception; openHierarchy click + ctrl+h
        int i = 10;
        try {
            int d = i / 0;
        } catch (Exception id) {
            System.out.println(id.getMessage());
        }
        List<String> fingers = new ArrayList<String>();
        fingers.add("first");
        fingers.add("second");
        System.out.println(fingers);
        try {
            if (fingers.size() < 3) {
                throw new IllegalArgumentException("invalid data");
            }
        } catch (Exception notFound) {
            System.out.println(notFound.getMessage());

        }
    }
}


