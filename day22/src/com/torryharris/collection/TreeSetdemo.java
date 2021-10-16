package com.torryharris.collection;

import java.util.Collections;
import java.util.TreeSet;

public class TreeSetdemo {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(10);
        integerTreeSet.add(1);
        integerTreeSet.add(5);
        System.out.println( integerTreeSet);

        TreeSet<String> strTreeSet = new TreeSet<>(Collections.reverseOrder());
        strTreeSet.add("div");
        strTreeSet.add("raks");
        strTreeSet.add("gop");
        strTreeSet.add("aish");
        System.out.println(strTreeSet);


    }
}
