package EmployeeManagement;

public class Tester extends Employee{
    private int testingHours;
    Tester(String name, int ID, double salary,int testingHours){
        super(name, ID, salary);
        this.testingHours=testingHours;
       
    }
    public double Calculate_total_salary(){
        double overtime=20;
        return super. Calculate_total_salary()+(testingHours*overtime);
    }
    
}
