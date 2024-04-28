import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date and time (YYYY-MM-DD HH:MM:SS): ");
        String input = scanner.nextLine();
        boolean valid = false;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = null;
        
        if (input.matches("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}")) {
            dateTime = LocalDateTime.parse(input, formatter);
            valid = dateTime.isAfter(LocalDateTime.now());
        }
        
        if (valid) {
            System.out.println("Input is valid.");
        } else {
            System.out.println("Input is not valid. Date/time should be in the future.");
        }
        
        scanner.close();
    }
}
