
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date in the format yyyy-MM-dd: ");
        String dateString = sc.nextLine();
        try {
            LocalDate date = LocalDate.parse(dateString);
            System.out.println("Parsed date: " + date);
        } catch (DateTimeParseException e) { 
            System.out.println("Error: Invalid date ");
    
        }       
    }
        
}

