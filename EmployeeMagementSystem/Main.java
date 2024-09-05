package EmployeeMagementSystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Full Time Employee");
        
        FullTimeEmployee fulltime=new FullTimeEmployee("Bushra", 1, LocalDate.of(2024, 2, 23));
        fulltime.display();
        System.out.println( fulltime.CalculateSalary(24));
        System.out.println();

        System.out.println("Part time employee");
        PartTimeEmployee parttime=new PartTimeEmployee("Jawaria", 2, LocalDate.of(2024, 2, 23));
        parttime.display();
       System.out.println( parttime.CalculateSalary(12));

       
        
        
    }
    
}
