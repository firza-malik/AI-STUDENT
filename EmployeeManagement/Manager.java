package EmployeeManagement;
// Add specific attributes and methods for each subclass (e.g., bonus for Manager, 
//projectsHandled for Developer)

public class Manager extends Employee{
     private  double bonus;
     Manager(String name, int ID, double salary, double bonus){
        super(name, ID, salary);
        this.bonus=bonus;

     }
    public double Calculate_total_salary(){
        return super.Calculate_total_salary()+bonus;

    }
    
}