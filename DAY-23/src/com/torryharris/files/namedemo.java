package com.torryharris.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class namedemo {
    public static void main(String[] args) throws IOException {
       Scanner scan = new Scanner(System.in);
       int n;
       String name;
        System.out.println("enter name and number");
        name = scan.nextLine();
        n = scan.nextInt();
        FileWriter writer= new FileWriter("name.txt");
        for(int i=0;i<n;i++){
            writer.write(name);

        }
        writer.close();



    }
}
