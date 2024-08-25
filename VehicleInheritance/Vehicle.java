package VehicleInheritance;
/* Create a class named Vehicle with attributes like model, year, and color.
 Create subclasses for Car, Motorcycle, and Truck inheriting from Vehicle.
 Add specific attributes and methods for each vehicle type (e.g., numberOfDoors for Car, 
engineCapacity for Motorcycle).
 Implement a method to display vehicle details for each type. */

public class Vehicle {
    private String model;
    private int year;
    private String color;
    Vehicle(String model,int year,String color){
        this.model=model;
        this.color=color;
        this.year=year;
    }
    public void display_vehicle_details(){
        System.out.println("model: "+model);
        System.out.println("color: "+ color);
        System.out.println("year: "+year);
    }
    
}
