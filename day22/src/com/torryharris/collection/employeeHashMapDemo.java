package com.torryharris.collection;


import com.torryharris.model.employee;

import java.util.HashMap;
import java.util.Map;

public class employeeHashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,Object> employee = new HashMap<>();

        employee e1 = new employee(1001, "divya", "employee", 5000000);
        employee e2 = new employee(1003, "aish", "lead", 1000000);
        employee e3 = new employee(1002, "rash", "manager", 600000);
        employee e4 = new employee(1004, "arch", "cleark", 500000);

        employee.put(e1.getEmpId(),e1);
        employee.put(e2.getEmpId(),e2);
        employee.put(e3.getEmpId(),e3);
        employee.put(e4.getEmpId(),e4);


        for (Map.Entry<Integer,Object> entry : employee.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}