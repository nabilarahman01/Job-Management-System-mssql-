/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jframe;

/**
 *
 * @author Nabila_lala
 */
class Jobs {
    private String JobTitle, CompanyName, Location, PostDate, Deadline;
    private double Salary;
    
    
    public Jobs(String JobTitle, String CompanyName, String Location, double Salary, String PostDate, String Deadline){
        this.JobTitle=JobTitle;
        this.CompanyName=CompanyName;
        this.Location=Location;
        this.Salary=Salary;
        this.PostDate=PostDate;
        this.Deadline=Deadline;
    }

    public String getJobTitle() {
        return JobTitle;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public String getLocation() {
        return Location;
    }

    public String getPostDate() {
        return PostDate;
    }

    public String getDeadline() {
        return Deadline;
    }

    public double getSalary() {
        return Salary;
    }
    
    
    
}
