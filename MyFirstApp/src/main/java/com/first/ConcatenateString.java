package com.first;

import java.sql.SQLOutput;

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

    }
}
