import java.util.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a date (yyyy-mm-dd):");
        String date1S = sc.nextLine();
        LocalDate date1 = LocalDate.parse(date1S);

        System.out.println("Enter another date (yyyy-mm-dd):");
        String date2S = sc.nextLine();
        LocalDate date2 = LocalDate.parse(date2S);
        sc.close(); 

        long daysDiff = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("The difference between the two dates is: " + daysDiff + " days");
    }

}
