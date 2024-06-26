/* Write a Java program to check if a given number is even or odd using an if-else statement.*/

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num:");
        int num= sc.nextInt();
        if(num%2==0){
              System.out.println("its a even num");
        }
        else{
                System.out.println("its a odd num");
       }
    
        sc.close();
        
    }
    
}
