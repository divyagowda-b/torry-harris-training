package com.torryharris.files;

import com.torryharris.model.employee;
import com.torryharris.model.person;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class persondeserializationdemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        person p1 = new person(1001, "aish", "employee", "balkhi");
        person p2 = new person(1003, "shiv", "doctor", "balkhi");
        person p3 = new person(1005, "par", "business", "hyderabad");
        person p4 = new person(1002, "ram", "tourism", "goa");
        person p5 = new person(1006, "sita", "SE", "bengaluru");

        FileInputStream fis = new FileInputStream("person.txt");
        ObjectInputStream personInputStream = new ObjectInputStream(fis);
        ArrayList<person> personArrayList = new ArrayList<>();
        person person;
        System.out.println("person details from the file are:");
        try {
            while (true) {
                person = (person)
                        personInputStream.readObject();
                System.out.println(person);
                personArrayList.add(person);
            }
        } catch (EOFException ex) {
            System.out.println("person details...");
            for (person p : personArrayList)
                System.out.println(p);

        }
        System.out.println("by personId");
        TreeMap<Integer, person> pTreeMap = new TreeMap<>();
        pTreeMap.put(p1.getPersonId(), p1);
        pTreeMap.put(p2.getPersonId(), p2);
        pTreeMap.put(p3.getPersonId(), p3);
        pTreeMap.put(p4.getPersonId(), p4);
        pTreeMap.put(p5.getPersonId(), p5);
        System.out.println();
        for (Integer key : pTreeMap.keySet()) {
            System.out.println(pTreeMap.get(key));


        }
    }
}



