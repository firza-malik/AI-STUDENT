/*Write a Java program to print a multiplication table for a given number. */

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a num");

      int num=sc.nextInt();
    
      for(int i=1;i<=11;i++){
        System.out.println(num +"x"+i+"="+ (num*i));

      }
      sc.close();
        
    }
    
}
