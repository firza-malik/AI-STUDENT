import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HolidayCalendar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        
        Map<String, LocalDate> holidays = new HashMap<>();
        holidays.put("New Year's Day", LocalDate.of(year, 1, 1));
        holidays.put("Christmas Day", LocalDate.of(year, 12, 25));

        System.out.println("Major holidays in " + year + ":");
        for (String holiday : holidays.keySet()) {
            System.out.println("- " + holiday + ": " + holidays.get(holiday));
        }
        
        int a = year % 19;
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = (19 * a + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * l) / 451;
        int month = (h + l - 7 * m + 114) / 31;
        int day = ((h + l - 7 * m + 114) % 31) + 1;
        LocalDate easterSunday = LocalDate.of(year, month, day);
        System.out.println("- Easter Sunday: " + easterSunday);
        LocalDate lastDayOfMay = LocalDate.of(year, 5, 31);
        int dayOfWeek = lastDayOfMay.getDayOfWeek().getValue();
        int daysToAdd = (dayOfWeek == 1) ? 6 : (DayOfWeek.SUNDAY.getValue() - dayOfWeek);
        LocalDate memorialDay = lastDayOfMay.plusDays(daysToAdd);
        System.out.println("- Memorial Day: " + memorialDay);
        LocalDate firstDayOfSeptember = LocalDate.of(year, 9, 1);
        dayOfWeek = firstDayOfSeptember.getDayOfWeek().getValue();
        daysToAdd = (dayOfWeek == 1) ? 0 : (DayOfWeek.MONDAY.getValue() - dayOfWeek + 7);
        LocalDate laborDay = firstDayOfSeptember.plusDays(daysToAdd);
        System.out.println("- Labor Day: " + laborDay);
        LocalDate firstDayOfNovember = LocalDate.of(year, 11, 1);
        dayOfWeek = firstDayOfNovember.getDayOfWeek().getValue();
        daysToAdd = (dayOfWeek == 4) ? 21 : ((4 - dayOfWeek + 7) + 21);
        LocalDate thanksgiving = firstDayOfNovember.plusDays(daysToAdd);
        System.out.println("- Thanksgiving: " + thanksgiving);
        
        scanner.close();
    }
}
