import java.time.Duration;
import java.time.LocalDateTime;

public class Durationtime {
    public static void main(String[] args){
        LocalDateTime eventStart = LocalDateTime.of(2024, 4, 26, 10, 0);
        LocalDateTime eventEnd = LocalDateTime.of(2024, 4, 26, 14, 30); 
        Duration duration = Duration.between(eventStart, eventEnd);
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        System.out.println("Event Duration: " + hours + " hours " + minutes + " minutes");
    }
}
