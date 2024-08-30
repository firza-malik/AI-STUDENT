import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            System.out.println("You entered: " + number);

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}

