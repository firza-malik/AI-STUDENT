import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = {10, 20, 30, 40, 50};

        try {
            System.out.print("Enter an index  ");
            int index = scanner.nextInt();

            int element = numbers[index];
            System.out.println("Element at index " + index + ": " + element);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds. Please enter a valid index.");
        } finally {
            scanner.close();
        }
    }
}
