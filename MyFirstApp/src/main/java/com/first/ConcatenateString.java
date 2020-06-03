package com.first;

import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConcatenateString {
    public static void main(String[] args) {
        String first1 = "There are main ways to concatenate String in Java:";
        String second1 = "Concatenation operator (+), StringBuffer class, StringBuilder class, String.concat() function.";
        System.out.println(first1 + " " + second1);

        StringBuilder sb1 = new StringBuilder(14);
        sb1.append(first1).append(" ").append(second1);
        System.out.println(sb1.toString());

        StringBuffer sb2 = new StringBuffer(15);
        sb2.append(first1).append(" ").append(second1); System.out.println(sb2.toString());

        String egw1 = "  egweerw  ererferw  kuy  yu i  ";
        System.out.println(egw1.length());
        System.out.println(egw1.trim());
        String egwtrimmed1 = egw1.trim();
        System.out.println(egwtrimmed1);
        System.out.println(egwtrimmed1.length());

        String[] ewg2 = egw1.split(" ");
        for (String string : ewg2) {
            System.out.println(string);
        }

        String[] ewg3 = egw1.split(" ");
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < ewg3.length; i++) {
            if (!ewg3[i].equals("")) {
                stringList.add(ewg3[i]);
            }
        }
        for (String element: stringList) {
            System.out.println(element);
        }

        String ewg4 = "   egweerw  ererferw  kuy  yu i . 13:05 aM; <>";
        String ewg5 = ewg4.toUpperCase();
        System.out.println(ewg5);

        String ewg6 = "   egweerw  ererferw  kuy  yu i ";
        String egwUpperCaseAllW = ewg6.replaceAll("w", "W");
        System.out.println(egwUpperCaseAllW);
        String egwUpperCaseFirstW = ewg6.replaceFirst("w", "W");
        System.out.println(egwUpperCaseFirstW);

        String prices = "this item previous price $5.99, Sale price $1.99. ";
        Pattern p1 = Pattern.compile("\\$\\d+(\\.\\d+)?");
        Matcher m = p1.matcher(prices);
        int i = 1;
        while(m.find()) {
            String price = m.group();
            if (i == 1) {
                System.out.println("Original price: " + price);
                i++;
            } else if (i == 2) {
                System.out.println("Sale price: " + price);
                break;
            }
        }

    }
}
