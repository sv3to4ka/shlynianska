package com.first;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class Application6 {
    public static void main(String[] args) {
        //create a file and identify the digits
        try {
            File flow1 = new File("Flow1.doc");
            if (flow1.createNewFile()) {
                System.out.println("File is created: "+flow1.getName());
            } else {
                System.out.println("File already exist: "+flow1.getAbsolutePath());
            }
        } catch (IIOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}