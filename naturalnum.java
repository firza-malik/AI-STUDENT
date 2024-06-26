/*Write a Java program to print the first n natural numbers (1 to n) using a for loop. */

import java.util.Scanner;

public class naturalnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num=sc.nextInt();
        for(int i=1; i<num;i++){
            System.out.println("natural num:"+i);


        }
        sc.close();

        
    }
    
}
