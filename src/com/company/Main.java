package com.company;
import java.io.File;
import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args){
        ItemReader reader = new ItemReader();

        for(int i=0; i<reader.storeList.size(); i++){
            System.out.println(reader.storeList.get(i).name);

        }
    }
}
