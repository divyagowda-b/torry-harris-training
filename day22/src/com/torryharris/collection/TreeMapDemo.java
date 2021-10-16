package com.torryharris.collection;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> treemap=new TreeMap<>();
        treemap.put(1,"sunday");
        treemap.put(2,"monday");
        treemap.put(4,"tuesday");
        treemap.put(6,"friday");
        System.out.println(treemap);



    }
}
