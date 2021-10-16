package com.torryharris.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> strHashSet= new HashSet<>();
        strHashSet.add("abcd");
        strHashSet.add("efgh");
        strHashSet.add("India");
        strHashSet.add("divya");
        System.out.println(strHashSet);
        strHashSet.remove("abcd");
        System.out.println(strHashSet);
        strHashSet.add("null");
        strHashSet.add(" ");
        System.out.println(strHashSet);

        HashSet<Integer> integerHashSet= new HashSet<>();
        integerHashSet.add(10);
        integerHashSet.add(2);
        integerHashSet.add(5);
        System.out.println(integerHashSet);

        HashSet<Float> fHashSet= new HashSet<>();
        fHashSet.add(10.0f);
        fHashSet.add(2.1f);
        fHashSet.add(5.5f);
        System.out.println(fHashSet);





    }
}
