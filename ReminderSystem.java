import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class ReminderSystem {
    public static void main(String[] args) {
        Timer timer = new Timer();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter reminder date and time in format yyyy-MM-dd HH:mm:ss: ");
        String reminderDateTimeStr = scanner.nextLine();
        Date reminderDateTime;
        try {
            reminderDateTime = dateFormat.parse(reminderDateTimeStr);
            long delay = reminderDateTime.getTime() - System.currentTimeMillis();
            System.out.println("Enter reminder message: ");
            String reminderMessage = scanner.nextLine();

            timer.schedule(new TimerTask() {
                public void run() {
                    System.out.println("Reminder: " + reminderMessage);
                }
            }, delay);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in the correct format (yyyy-MM-dd HH:mm:ss).");
        }
        scanner.close();
    }
}
