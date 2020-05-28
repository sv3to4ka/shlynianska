package com.first;

public class Application3 {

    public static String name = "123";

    public static void main(String[] args) {
        //use cycles "for","while","foreach"Cycle operators.Create for, while, do while cycles that iterate 10 times
        // and print iteration number to console;
        String[] pupilNames = new String[10];
        System.out.println(pupilNames.length);
        for (int i = 0; i < pupilNames.length; i++) {
            pupilNames[i] = "Pupil " + (i + 1);
            System.out.println((i + 1));
        }
        for (String name : pupilNames) {
            System.out.println(name);
        }
        int a = 0;
        while (a < pupilNames.length) {
            pupilNames[a] = pupilNames[a] + " " + a;
            System.out.println(pupilNames[a]);
            a++;
        }
        int b = 0;
        do {
            pupilNames[b] = pupilNames[b] + " " + b;
            System.out.println(pupilNames[b]);
        } while (++b < pupilNames.length);

        int[] weekDays = new int[7];
        System.out.println(weekDays.length);

        for (int i = 0; i < weekDays.length; i++) {
            weekDays[i] = i + 1;
            System.out.println("week day " + (i + 1));
            if ((i + 1) == weekDays.length) {
                System.out.println("Iteration number " + (i + 1));
            }
        }
        for (int dayNumbers : weekDays) {
            System.out.println(dayNumbers + "th " + "Day");
        }
        int wd = 5;
        int i = 0;
        while (weekDays[i] <= wd) {
            System.out.println("This is " + (i + 1) + " working day!");
            i++;
        }
        int we = 6;
        int n = 0;
        do {
            if (weekDays[n] >= we) {
                System.out.println("This is weekend: " + weekDays[n]);
            }
        } while (++n < weekDays.length);

        //Infinite Loop
        int d = 0;
        String[] p = new String[8];
        while (d > p.length) {
         p[d] = "Pupil " + (d+1);
         System.out.println(p[d]+ " is working at the desk #" + (d+1));
            d++;
        }

        System.out.println(dividedleaf(100.00f));
        System.out.println(geoprg(2));
    }

    //Create recursion with exit condition
    private static float dividedleaf(float l) {
        int de = 2;
        float division = l / de;
        if (division >= 1) {
            division = dividedleaf(division);
        }
        return division;
    }
    //Recursion without exit condition
    private static int geoprg(int denominator) {
        int n = 2;
        int x = (n-1) * denominator;
        int maxlenght = 100;
        if (x <= maxlenght) {
            x = geoprg(x);
        }
        return x;

    }

}















