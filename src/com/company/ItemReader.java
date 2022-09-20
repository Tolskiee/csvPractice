package com.company;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ItemReader {

    ArrayList<items> storeList = new ArrayList<items>();

    {
        try {
            //find file
            File fileLocation = new File("store-items.csv");
            //use a scanner that will read from file
            Scanner readfile = new Scanner(fileLocation);

            StringTokenizer token = null;

            String name ="";
            double price = 0;

            while (readfile.hasNextLine()){
                token = new StringTokenizer(readfile.nextLine(),",");
                name = token.nextToken();
                price = Double.parseDouble(token.nextToken());

                items storeItems = new items(name, price);

                storeList.add(storeItems);
            }

            System.out.println(storeList.get(1).name);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }






}
