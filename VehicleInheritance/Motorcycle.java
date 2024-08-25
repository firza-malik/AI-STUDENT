package VehicleInheritance;

public class Motorcycle extends Vehicle {
    private int engineCapacity;
    Motorcycle(int engineCapacity,String model,int year,String color){
        super(color, year, color);
        this.engineCapacity=engineCapacity;

    }
    public void display_vehicle_details(){
        System.out.println("*****Motorcycle*****");
        super.display_vehicle_details();
        System.out.println("Engine Capacity: "+engineCapacity);
        
    }

    
}
