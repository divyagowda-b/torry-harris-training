package com.torryharris.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/finalproject",
                    "root", "Divya@582");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
