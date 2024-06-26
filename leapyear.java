/*20. Write a Java program to determine if a given year is a leap year. */

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year:");
        int year=sc.nextInt();
        if (year%400==0&&year%100!=0||year%4==0) {
            System.out.println("its  a leap year");
            
        }else{
            System.out.println("its not a leap year");
        }
        sc.close();

        
    }
    
}
