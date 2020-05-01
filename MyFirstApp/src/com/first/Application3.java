package com.first;

public class Application3 {
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


        System.out.println(fibonacci(100.00f));
    }

    //Create recursion with exit condition
    private static float fibonacci(float l) {
        int de = 2;
        float division = l / de;
        if (division >= 1) {
            division = fibonacci(division);
        }
        return division;
    }
}















