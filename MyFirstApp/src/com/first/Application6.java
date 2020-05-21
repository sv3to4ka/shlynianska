package com.first;

import javax.imageio.IIOException;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

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
        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
        try {
            File flow2 = new File("./ffff/Flow2.doc");
            if (!flow2.getParentFile().exists()) {
                flow2.getParentFile().mkdirs();
            }
            if (flow2.createNewFile()) {
                System.out.println("File is created: "+flow2.getName());
            } else {
                System.out.println("File already exist: "+flow2.getCanonicalPath());
            }

            FileWriter wr = new FileWriter(flow2.getCanonicalPath());
            wr.write("Stock Check1.11\n" +
                    "1)\tGrey: Stock Check -> create ad-hoc\n" +
                    "2)\tPaste PartRef -> Add -> Part Added\n" +
                    "3)\tCreate Stock Check\n" +
                    "4)\tView Stock Check Job -> Update Stock Sheet -> edit Qty -> Save (Active in white site) 01\n" +
                    "5)\tReturn to Stock Job -> Release Stock Sheet -> Release selection (InActive in white site) 022\n" +
                    "Puschase Order (type 1)\n" +
                    "1)\tGo to List of Suppliers\n" +
                    "2)\tClick on New PO\n" +
                    "3)\tEnter 2 different PartRefs to Part Number (Description) e.g.\n" +
                    "4)\tClick on Release button\n" +
                    "5)\tGo to Purchase Order History\n" +
                    "6)\t\n" +
                    "GRN\n" +
                    "1)\tGo to List of Suppliers\n" +
                    "2)\tClick on New GRN\n" +
                    "3)\tEnter the same PartRefs, Descriptions, Supplier Doc. Number/Doc. Date\n" +
                    "4)\tClick on Prepare to Complete Goods In (type 4)\n" +
                    "5)\tClick to Accept\n" +
                    "Admin -> Purchase Order# -> Authorise it.\n" +
                    "Purchase Order# is moved to Awaiting Goods In area\n" +
                    "Goods In\n" +
                    "1)\tFilter by Manufacturer (1200)\n" +
                    "2)\tEnter PartRef, Qty 1/Label 0\n" +
                    "3)\t\n" +
                    "GRNReturn (type 6)\n" +
                    "1)\tEnter PartRef 11404 2, Return Date, -> Prepare to Complete Goods In Return\n" +
                    "2)\tAccept and mark the GoodsIn Return Basket as complete\n" +
                    "\n" +
                    "You can check all your documents on Existing Purchase Orders filtered list\n" +
                    " \n" +
                    "1)\tПарт \n" +
                    " \n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "\n");
            wr.close();
            System.out.println("Successfully wrote to the file.");
            Stream<String> lines = Files.lines(Paths.get(flow2.getCanonicalPath()), StandardCharsets.UTF_8);
            Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
            lines.forEach(line -> {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (pattern.matcher(word).matches()) {
                        double d = Double.parseDouble(word);
                        System.out.println(2 * d);
                    }
                }
            });

        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
        try {
            String fileName1 = "/Users/shlynianska/Flow.txt";
            File file1 = new File(fileName1);
            FileReader read1 = new FileReader(file1);
            BufferedReader br = new BufferedReader(read1);
            String line;
            Pattern p1 = Pattern.compile("-?\\d+(\\.\\d+)?");
            while((line = br.readLine()) != null){
                System.out.println(line);
                Matcher m = p1.matcher(line);
                while(m.find()) {
                    String digit = m.group();
                    double d1 = Double.parseDouble(digit);
                    System.out.println(d1 * 1.2);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error occurred.");
            e.printStackTrace();
        }

    }
}
