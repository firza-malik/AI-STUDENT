import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numerator;
        int denominator;

        try {
            System.out.print("Enter the numerator: ");
            numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integer values.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }
}
