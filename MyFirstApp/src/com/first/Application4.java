package com.first;

import java.util.*;

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
        //HashMap
        HashMap<String, String> body = new HashMap<String, String>();
        body.put("Hair", "Hairstyle");
        body.put("Eyebrows", "Tattoo");
        body.put("Eyes", "Makeup");
        body.put("Nose", "Runny nose");
        body.put("Lips", "Lipstick");
        body.put("Teeth", "Smile");
        body.put("Neck", "Necklace");
        body.put("111", "222");
        System.out.println(body.size());
        body.remove("111");
        System.out.println(body);
        System.out.println(body.size());
        //print keys and values
        for (String i: body.keySet()) {
            System.out.println(i);
        }
        for (String a: body.values()) {
            System.out.println(a);
        }
        //TreeMap
        TreeMap<String, String> bodyParts = new TreeMap<String, String>();
        bodyParts.put("Head", "Ear");
        bodyParts.put("Hand", "Finger");
        bodyParts.put("Shoulder", "Stomach");
        bodyParts.put("Leg", "Foot");
        System.out.println(bodyParts);
        System.out.println(bodyParts.size());
        for (String i: bodyParts.keySet()) {
            System.out.println(i);
            }
        for (String b: bodyParts.values()) {
            System.out.println(b);
        }
        //HashSet
        HashSet<String> doing1 = new HashSet<String>();
        doing1.add("drink");
        doing1.add("eat");
        doing1.add("smell");
        doing1.add("move");
        doing1.add(null);
        doing1.add("move");
        System.out.println(doing1);
        System.out.println(doing1.size());
        //TreeSet
        TreeSet<String> doing2 = new TreeSet<String>();
        doing2.add("run");
        doing2.add("fly");
        doing2.add("crawl");
        doing2.add("walk");
        doing2.add("null");
        doing2.add("run");
        System.out.println(doing2);
        System.out.println(doing2.size());
        //LinkedHashSet
        LinkedHashSet<String> doing3 = new LinkedHashSet<String>();
        doing3.add("look at");
        doing3.add("look for");
        doing3.add("look after");
        doing3.add("look around");
        doing3.add("look into");
        doing3.add("look on");
        doing3.add("look out");
        doing3.add("look up");
        doing3.add("look up");
        doing3.add(null);
        System.out.println(doing3);
        System.out.println(doing3.size());

        for (Map.Entry<String, String> entry : body.entrySet()) {
            System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
