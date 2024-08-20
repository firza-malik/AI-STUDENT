package HotelbookingSystem;

import java.time.LocalDate;

public class DeluxeRoom extends Room {
    
    DeluxeRoom(int roomno){
       super(1300, 4987);

    }
     public void Roombook(int day, long CNIC, String address) {
        if (day <= 0 || CNIC <= 0 || address == null ) {
            System.out.println("Details incomplete");
        } else {
    
            LocalDate date = LocalDate.now();
            System.out.println("DeluxeRoom booked successfully");
            System.out.println("Date of room booking: " + date);
            System.out.println("room booking for " +day+" days");
            System.out.println("per day price: "+price);
            TotalCost(day);
        }
    }
    
}
