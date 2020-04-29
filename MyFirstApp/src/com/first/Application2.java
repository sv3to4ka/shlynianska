package com.first;

import javax.crypto.spec.PSource;

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
        // Create 2 different strings. Compare them with usage if ternary operator and print "Not equal", "Equal" and explain
        String loginFromRequest = "manager";
        String loginFromDB = "accountant";
        String login = loginFromRequest == loginFromDB ? "Valid login": "Access denied";
        System.out.println(login);
        //Access denied
        String child1 = "boy";
        String child2 = "girl";
        String child = child1 == child2 ? "Equal" : "Not equal";
        System.out.println(child);
        // Explain difference betweeb &,|,&&,|| and provide example.
        int age1 = 10;
        long age2 = 98;
        float money1 = 5000.00f;
        double money2 = 1500400.00;
        if (age1 > 0 & age2 > 0) {
            System.out.println("greater 0");
            } else {
            System.out.println(0);
        }
        if (age1 <= 5 & age2 >= 100) {
            System.out.println("oops!");
            } else {
            System.out.println(false);
        }
        if (age1 <= 5 && age2 >= 100) {
            System.out.println("oops!");
        } else {
            System.out.println(false);
        }
       if (money1 <= 100 | money2 > 1000000 | age1 == 100) {
           System.out.println("There are some money");
       } else {
           System.out.println("None");
       }
        if (money1 <= 100 || money2 > 1000000 || age1 == 100) {
            System.out.println("There are some money");
        } else {
            System.out.println("None");
        }
    }
        // Create 2 string variables with same value but initialize one with literal and another with constructor.


        // (String a ="lalala";         	String b = new String("lalala");)
        // Compare this values with usage of == and equal. Explain result

    }
