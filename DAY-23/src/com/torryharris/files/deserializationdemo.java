package com.torryharris.files;

import com.torryharris.model.employee;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class deserializationdemo {
    public static void main(String[] args) throws IOException ,ClassNotFoundException{
            FileInputStream fis = new FileInputStream("employees.txt");
            ObjectInputStream employeeInputStream = new ObjectInputStream(fis);
        ArrayList<employee> employeeArrayList = new ArrayList<>();
        employee  employee;
        System.out.println("employee details from the file are:");
        try {
            while (true) {
                employee = (employee)
                        employeeInputStream.readObject();
                System.out.println(employee);
                employeeArrayList.add(employee);
            }
        }catch (EOFException ex){
            System.out.println("emplyee details...");
            for(employee emp : employeeArrayList)
                System.out.println(emp);





            }


        }


}
