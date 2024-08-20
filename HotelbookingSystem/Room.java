/* Scenario: Develop a hotel booking system where customers can book rooms. Rooms can be Standard, Deluxe, or Suite, each with a room number and price.
Concepts: Classes, Inheritance, Date
Task: Design a Room class and derive StandardRoom, DeluxeRoom, and SuiteRoom classes. Implement methods to book rooms and calculate the total cost.*/


    
package HotelbookingSystem;

import java.time.LocalDate;

public class Room {
    public int price;
    public int roomno;
    public int day;
    

    Room(int price, int roomno) {
        this.price = price;
        this.roomno = roomno;
    }

    public void Roombook(int day, long CNIC, String address) {
        if (day <= 0 || CNIC <= 0 || address == null ) {
            System.out.println("Details incomplete");
        } else {
    
            LocalDate date = LocalDate.now();
            System.out.println("Room booked successfully");
            System.out.println("Date of room booking: " + date);
            System.out.println("room booking for "+day+" days");
            System.out.println("per day price: "+price);
            TotalCost(day);
        }
    }

    public void TotalCost(int day) {
        int total =day*price;
        System.out.println("total cost:"+total);
    }

    
}
