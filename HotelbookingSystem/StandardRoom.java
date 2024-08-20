package HotelbookingSystem;

import java.time.LocalDate;

public class StandardRoom extends Room {
    StandardRoom(int roomno){
        super(500, 12345);
    }

    public void Roombook(int day, long CNIC, String address) {
        if (day <= 0 || CNIC <= 0 || address == null ) {
            System.out.println("Details incomplete");
        } else {
    
            LocalDate date = LocalDate.now();
            System.out.println("Standard Room booked successfully");
            System.out.println("Date of room booking: " + date);
            System.out.println("room booking for "+day+" days");
            System.out.println("per day price: "+price);
            TotalCost(day);
            
        }
    }
    
}
