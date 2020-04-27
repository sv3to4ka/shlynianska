package com.first;

public class Application2 {
    public static void main(String[] args) {
        //use conditions "if" and  "case"
        // Create 4 boolean variables(true,true,false,false) and compare them between themselves-result print in console.
        boolean hour = true;
        boolean day = true;
        boolean week = false;
        boolean month = false;
        if (hour == day) {
            System.out.println("Day consists of 24 hours");
        }
        if (hour != day) {
            System.out.println("Hour looks like a day");
        }
        if (week == month) {
            System.out.println("Month consists of 4 weeks");
        }
        if (week != month) {
            System.out.println("nothing");
        }
        if (hour != week) {
            System.out.println("Week is longer than hour");
        }
        if (hour == week) {
            System.out.println(100);
        }
        // Create 4 different numeric variables and compare them with the usage of <,<=,!=,==,===,>=,> .
        // === illegal operator
        int carrots1 = 10;
        int carrots2 = 20;
        int carrots3 = 30;
        int carrots4 = 40;
        int carrots5 = 40;

        switch (carrots1) {
            case 1:
                System.out.println("It is not 1");
                break;
            case 23:
                System.out.println("It is not 23");
                break;
            case 10:
                System.out.println("These are 10 carrots");
                break;
            default:
                System.out.println("null");
                break;
        }
        if (carrots1 > carrots2) {
            System.out.println(0);
        }
        if (carrots1 < carrots2) {
            System.out.println(10);
        }
        if (carrots2 <= carrots3) {
            System.out.println(true);
        }
        if (carrots2 >= carrots3) {
            System.out.println(false);
        }
        if (carrots4 == carrots5) {
            System.out.println("equal");
        }
        if (carrots4 != carrots5) {
            System.out.println("not equal");
        } else {
            System.out.println("equal");
        }
        if (carrots3 == 30) {
            System.out.println(30);
        } else {
            System.out.println("!=30");
        }

        // Create 2 different strings. Compare them with usage if ternary operator
        // and print "Not equal", "Equal" and explain
        // Explain difference betweeb &,|,&&,|| and provide example.
        // Create 2 string variables with same value but initialize one with literal and another with constructor.
        // (String a ="lalala";         	String b = new String("lalala");)
        // Compare this values with usage of == and equal. Explain result

    }
}
