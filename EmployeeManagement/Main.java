package EmployeeManagement;


public class Main {
    public static void main(String[] args) {
        Employee[] employees=new Employee[4];
        employees[0]=new Manager("Abc",123,200000,300);
        employees[1]=new Developer("DEF", 398, 30000, 5);
        employees[2]=new Tester("GHI", 506, 22000, 20);
        employees[3] = new Manager("JKL", 789, 250000, 500);
        double total=0;
        for (Employee Employees : employees) {
           total+= Employees.Calculate_total_salary();
            
        }
        System.out.println("total salary of all employees:"+""+total);

        
    }
    
}
