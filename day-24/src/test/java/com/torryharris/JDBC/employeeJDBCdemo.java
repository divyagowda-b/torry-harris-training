package com.torryharris.JDBC;

import com.torryharris.model.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import static java.lang.Class.forName;

public class employeeJDBCdemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/employejava";
            String username = "root";
            String password = "Divya@582";
            Connection connection = DriverManager.getConnection(url, username, password);



            System.out.println();
            Statement statement = connection.createStatement();


            employee e1 = new employee(1002, "ram", "manager", 500000);
            employee e2 = new employee(1001, "aish", "lead", 250000);
            employee e3 = new employee(1003, "shiv", "clerk", 500000);
            employee e4 = new employee(1004, "sita", "manager", 500000);
            employee e5 = new employee(1005, "par", "lead", 500000);
            String insertQuery = "inserted into employee values(" +e1.getEmpId()+ ",'"+
                     e1.getName() + "' ,'" +e1.getDesignation()+ "'," + e1.getSalary()+")";

            System.out.println(insertQuery);
            statement.execute(insertQuery);
            System.out.println("inserted the values successfully");
            statement.close();
            connection.close();
        }
        catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();

        }



    }
}
