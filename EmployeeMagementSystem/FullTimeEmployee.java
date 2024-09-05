package EmployeeMagementSystem; 
/*/*Scenario: Create a simple Employee Management System where each employee has a name, ID, and date of joining. There are two types of employees: Full-Time and Part-Time.
Concepts: Classes, Inheritance, Date
Task: Create a base class Employee and derive FullTimeEmployee and PartTimeEmployee from it. Include methods to calculate salary based on working hours. */

import java.time.LocalDate;

public class FullTimeEmployee extends Employee{
    public int hourrate=500;
    
 FullTimeEmployee(String name,int Id,LocalDate date){
    super( name, Id, date);
   
 }

public int CalculateSalary(int Hours){
    System.out.println("******salary based on working hours******");
    System.out.print("FulltimeEmployee salary based on hours:");
    return Hours*hourrate;
    

  }

    

    
}
