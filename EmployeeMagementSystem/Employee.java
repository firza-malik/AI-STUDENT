package EmployeeMagementSystem;
/*Scenario: Create a simple Employee Management System where each employee has a name, ID, and date of joining. There are two types of employees: Full-Time and Part-Time.
Concepts: Classes, Inheritance, Date
Task: Create a base class Employee and derive FullTimeEmployee and PartTimeEmployee from it. Include methods to calculate salary based on working hours. */

import java.time.LocalDate;

public class Employee {
    
    public String name;
    public int Id; 
    public LocalDate date;
    public int hours;
   
    
    Employee(String name,int Id,LocalDate date){
        this. name=name;
        this.Id=Id;
        this.date=date;
       
      

    }
    public String getName(){
        return name;
    }
    public int getId(){
        return Id; 

    }
    public LocalDate getDate(){
        return date;
    }
    
    public int calculate(int hours){
        return 0;
    }
    public void display(){
        System.out.println("Name:"+name);
        System.out.println("joing date:"+date);
        System.out.println("Id number:"+Id);
    }
    

        
    
    
}
