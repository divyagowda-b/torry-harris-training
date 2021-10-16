package com.torryharris.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapdemo {
    public static void main(String[] args) {
        HashMap<Integer,String> Students = new HashMap<>();

        Students.put(1001,"Amar");
        Students.put(1002,"Amar");
        Students.put(1003,"Ram");
        Students.put(1004,"siya");
        System.out.println(Students);

        Students.put(1001,"akbar");
        System.out.println(Students);
        for(Map.Entry<Integer,String> entry: Students.entrySet()){
            System.out.println(entry.getKey() +"=" +entry.getValue());
        }
        System.out.println();
           for(Integer key : Students.keySet()){
               System.out.println(key+"="+Students.get(key));


        }


    }
}
