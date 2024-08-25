package EmployeeManagement;


public class Developer extends Employee {
 private int projectsHandled;
 Developer(String name, int ID, double salary,int projectsHandled){
    super(name, ID, salary);
    this.projectsHandled=projectsHandled;
 }
 public double Calculate_total_salary(){
    return super.Calculate_total_salary()+(projectsHandled*1000);
 }
    
}
