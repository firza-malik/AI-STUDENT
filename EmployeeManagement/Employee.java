package EmployeeManagement;
/* Create a class named Employee with attributes like name, ID, and salary.
 Create subclasses for Manager, Developer, and Tester inheriting from Employee.
 Add specific attributes and methods for each subclass (e.g., bonus for Manager, 
projectsHandled for Developer).
 Calculate the total salary for all employees, considering any bonuses or allowances */

public class Employee {
    private String name;
    private int ID;
    private double salary;
    Employee(String name, int ID,double salary){
        this.name=name;
        this.salary=salary;
        this.ID=ID;
    }
    
    public double Calculate_total_salary(){
        return salary;   

    }
    
} 
