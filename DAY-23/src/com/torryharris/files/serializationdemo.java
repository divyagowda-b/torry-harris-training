package com.torryharris.files;

import com.torryharris.model.employee;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class serializationdemo {
    public static void main(String[] args) throws IOException {
        employee e1 = new employee(1021,"elena","manager",5000000);
        employee e2 = new employee(1022,"damon","HR",1000000);
        employee e3 = new employee(1021,"Klause","clerk",2000000);

        FileOutputStream fos = new FileOutputStream("employees.txt");
        ObjectOutputStream employeeOutputStream = new ObjectOutputStream(fos);
        employeeOutputStream.writeObject(e1);
        employeeOutputStream.writeObject(e2);
        employeeOutputStream.writeObject(e3);
        employeeOutputStream.close();
        employeeOutputStream.close();
        fos.close();




    }

}
