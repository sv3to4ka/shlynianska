package com.first;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PupilSerializable {
    public static void main(String[] args) {
        String filename = "time.ser";
        Pupil p = new Pupil("Svitlana", "Hlynianska");
        //save Object to file
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(filename);
            out = new ObjectOutputStream(fos);
            out.writeObject(p);

            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //read Object from file
        //save Object to file
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            p = (Pupil) in.readObject();
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println(p);
    }
}