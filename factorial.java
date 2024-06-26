/*16. Write a Java program to find the factorial of a number using a for loop */
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        if (num < 0) {
            System.out.println("Please enter a non-negative number.");
        } else {
            
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("The factorial of " + num + " is: " + fact);
        }
        sc.close();
    }
}