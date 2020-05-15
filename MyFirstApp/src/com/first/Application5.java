package com.first;

public class Application5 {
    public static void main(String[] args) {
        //catch Exception; openHierarchy click + ctrl+h
        int i = 10;
        try {
            int d = i / 0;
        } catch (Exception id) {
            System.out.println(id.getMessage());
        }

    }
}
