/*Write a Java program to calculate the area and perimeter of a rectangle given its length 
and width as input */

import java.util.*;
public class calarea{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.err.println("enter a length");
        int length= sc.nextInt();
        int width= sc.nextInt();

        int area=length*width;
        int perimeter=2*(length+width);
        System.out.println("area of rectanglar:"+area);
        System.out.println("perimeter of reactanglar:"+ perimeter);
        sc.close();

        
    }
}