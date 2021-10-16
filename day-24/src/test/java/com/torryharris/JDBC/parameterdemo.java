package com.torryharris.JDBC;

import com.torryharris.model.employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class parameterdemo {



    public static void insertUsingPreparedStatement(Connection connection, ArrayList<employee> emplist )
        throws SQLException {
        String pQuery="insert into employee values(?,?,?,?)";
        PreparedStatement pstat = connection.prepareStatement(pQuery);

        for (employee employee:emplist){
            pstat.setInt(1,employee.getEmpId());
            pstat.setString(2,employee.getName());
            pstat.setString(3,employee.getDesignation());
            pstat.setInt(4,employee.getSalary());
            pstat.execute();


        }


    }
}
