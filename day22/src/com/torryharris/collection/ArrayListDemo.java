package com.torryharris.collection;

import com.torryharris.comparator.personCityComparator;
import com.torryharris.model.car;
import com.torryharris.model.employee;
import com.torryharris.model.person;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        car c1 = new car(12022, "kia", "petrol", 3.5f);
        car c2 = new car(12023, "audi", "diesel", 5.5f);
        car c3 = new car(12026, "ford", "petrol", 4.3f);
        car c4 = new car(12028, "rollsroyce", "petrol", 3.8f);
        car c5 = new car(12024, "ford", "diesel", 4.9f);

        ArrayList<car> carArrayList = new ArrayList<>();
        carArrayList.add(c1);
        carArrayList.add(c2);
        carArrayList.add(c3);
        carArrayList.add(c4);
        carArrayList.add(c5);
        System.out.println(carArrayList);
        for (int i = 0; i < carArrayList.size(); i++) {
            System.out.println(carArrayList.get(i));
        }

        System.out.println();
        System.out.println("by power");
        TreeMap<Float,car> cTreeMap= new TreeMap<>();
        cTreeMap.put(c1.getPower(),c1);
        cTreeMap.put(c2.getPower(),c2);
        cTreeMap.put(c3.getPower(),c3);
        cTreeMap.put(c4.getPower(),c4);
        cTreeMap.put(c5.getPower(),c5);
        System.out.println();
        for(Float key:cTreeMap.keySet()){
            System.out.println(cTreeMap.get(key));

        }
        System.out.println();
        System.out.println("by name");
        HashMap<String,car> cHashMap= new HashMap<>();
        cHashMap.put(c1.getName(),c1);
        cHashMap.put(c2.getName(),c2);
        cHashMap.put(c3.getName(),c3);
        cHashMap.put(c4.getName(),c4);
        cHashMap.put(c5.getName(),c5);
        System.out.println();
        for(String key:cHashMap.keySet()){
            System.out.println(cHashMap.get(key));

        }


    }
}
