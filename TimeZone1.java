import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZone1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter date and time (yyyy-MM-dd HH:mm): ");
        String dateTimeString = sc.nextLine();
        System.out.print("Enter source time zone (e.g., UTC): ");
        String sourceTimeZone = sc.nextLine();
        System.out.print("Enter target time zone (e.g., America/Los_Angeles): ");
        String targetTimeZone = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeString, formatter);
        ZonedDateTime sourceZonedDateTime = ZonedDateTime.of(dateTime, ZoneId.of(sourceTimeZone));
        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(ZoneId.of(targetTimeZone));
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z");
        System.out.println("Converted date and time in " + targetTimeZone + ": " + targetZonedDateTime.format(outputFormatter));

        sc.close();
    }
}
