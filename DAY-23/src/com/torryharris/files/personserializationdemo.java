package com.torryharris.files;

import com.torryharris.model.person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class personserializationdemo {
    public static void main(String[] args) throws IOException {
        person p1 = new person(1001, "aish", "employee", "balkhi");
        person p2 = new person(1003, "shiv", "doctor", "balkhi");
        person p3 = new person(1005, "par", "business", "hyderabad");
        person p4 = new person(1002, "ram", "tourism", "goa");
        person p5 = new person(1006, "sita", "SE", "bengaluru");


        FileOutputStream fos = new FileOutputStream("person.txt");
        ObjectOutputStream employeeOutputStream = new ObjectOutputStream(fos);
        employeeOutputStream.writeObject(p1);
        employeeOutputStream.writeObject(p2);
        employeeOutputStream.writeObject(p3);
        employeeOutputStream.writeObject(p4);
        employeeOutputStream.writeObject(p5);

        employeeOutputStream.close();
        employeeOutputStream.close();
        fos.close();



    }

}
