
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFor {
    public static void main(String[] args) {
        System.out.println("Enter a time in 24-hour format (hh:mm):");
        Scanner sc = new Scanner(System.in);
        String time24 = sc.nextLine();
        DateTimeFormatter time24Formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime time24Obj = LocalTime.parse(time24, time24Formatter);
        DateTimeFormatter time12Formatter = DateTimeFormatter.ofPattern("h:mm a");
        String time12 = time24Obj.format(time12Formatter);
        System.out.println("Time converted from 24-hour to 12-hour format: " + time12);
    }
    
}
