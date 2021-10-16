package com.torryharris.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class filereadingdemo {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("input.txt");
        System.out.println("file contents are:");
        int ch;
        while((ch=fis.read())!=-1){
            System.out.print((char)ch);
        }
        fis.close();

        FileOutputStream fos = new FileOutputStream("output.txt");
        String str = "this is an output file. \n this contains data output.";
        char []array = str.toCharArray();
        for(char c:array){
            fos.write((int)c);
        }
        fos.close();


    }
}
