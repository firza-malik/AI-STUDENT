package VehicleInheritance;

public class Car extends Vehicle {
    private int numberOfDoors;
    Car(String model,int year,String color,int numberOfDoors){
        super(model, year, color);
        this.numberOfDoors=numberOfDoors;
    }
    public void display_vehicle_details(){
        System.out.println("*********car Detials*********");
        super.display_vehicle_details();
        System.out.println("Number of door: "+ numberOfDoors);
        
        
    }
    
    
}
