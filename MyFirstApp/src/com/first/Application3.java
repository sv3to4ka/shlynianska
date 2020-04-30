package com.first;

public class Application3 {
    public static void main(String[] args) {
        //use cycles "for","while","foreach"Cycle operators.Create for, while, do while cycles that iterate 10 times
        // and print iteration number to console;
        String[] pupilNames = new String[8];
        System.out.println(pupilNames.length);
        for (int i = 0; i < pupilNames.length; i++) {
            pupilNames[i] = "Pupil " + i;
            System.out.println(i);
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





//Create recursion with exit condition.

//Create an infinite loop.

//Create recursion without exit condition.

    }
}
