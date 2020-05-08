package com.first;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Application4 {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<String>();
        fruit.add("apple");
        fruit.add("peach");
        fruit.add("pear");
        System.out.println(fruit);

        List<String> vegetables = new LinkedList<String>();
        vegetables.add("beetroot");
        vegetables.add("carrot");
        vegetables.add("cabbage");
        System.out.println(vegetables);

        fruit.remove(0);
        System.out.println(fruit);

        vegetables.remove(2);
        System.out.println(vegetables);

        fruit.set(1, "yellow yellow yellow yellow");
        System.out.println(fruit);

        fruit.set(0, "first");
        fruit.set(1, "second");
        System.out.println(fruit);

        vegetables.set(0, "first");
        vegetables.set(1, "second");
        System.out.println(vegetables);

        System.out.println(fruit.equals(vegetables));

    }
}
