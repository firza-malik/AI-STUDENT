import java.util.Scanner;

public class function {
    public double circle(double pi, double radius) {
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = sc.nextDouble();
        
        function area = new function();
        double pi = 3.14;
        double circleArea = area.circle(pi, radius);
        
        System.out.println("The area of the circle with radius " + radius + " is: " + circleArea);
        
        sc.close(); 
    }
}
