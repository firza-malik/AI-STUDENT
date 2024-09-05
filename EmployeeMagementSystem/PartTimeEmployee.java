package EmployeeMagementSystem;


import java.time.LocalDate;

public class PartTimeEmployee extends Employee{
    public int hourrate=300;
    
    PartTimeEmployee(String name,int Id,LocalDate date){
        super(name, Id, date);
    }
    public int CalculateSalary(int Hours){
        System.out.println("******salary based on working hours*******");
        System.out.print("parttimeEmployee salary based on hours:");
        return Hours*hourrate;
        
    
      }
  
    
}
