package com.torryharris.model;

public class manager extends employee{
    private String projectname;
    private int noOfteam;

    public manager(String name, int employeeeid, String designation, int salary) {
        super(name, employeeeid, designation, salary);
        this.projectname=projectname;
        this.noOfteam=noOfteam;

    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public int getNoOfteam() {
        return noOfteam;
    }

    public void setNoOfteam(int noOfteam) {
        this.noOfteam = noOfteam;
    }
    public void callmeeting(){
        System.out.println("manager calling for meeeting....");
    }

   @override
    public String toString(){
        return"manager{"+super.toString()+
              ",projectname="+projectname+ '\''+
               ",noOfteam="+noOfteam+
               '}';
    }
}
