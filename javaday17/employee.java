package com.torryharris.model;

public class employee {
        private String name;
        private int employeeeid;
        private String designation;
        private int salary;

    public employee(String name, int employeeeid, String designation, int salary) {
        this.name = name;
        this.employeeeid = employeeeid;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeeid() {
        return employeeeid;
    }

    public void setEmployeeeid(int employeeeid) {
        this.employeeeid = employeeeid;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void display(){
        System.out.println("employee name"+name);
        System.out.println("employeeid"+employeeeid);
        System.out.println("employee designation"+designation);
        System.out.println("employee salary"+salary);
    }
    @override
    public java.lang.String toString(){
        return
                "name='"+name +'\''+
                ",employeeeid="+employeeeid+
                ",designation='" +designation +'\''+
                        ",salary=" +salary;
    }
}
