package VehicleInheritance;


public class Truck extends Vehicle{
    private int LoadCapacity;
    Truck(String model,int year,String color,int LoadCapacity){
        super(model, year, color);
        this.LoadCapacity=LoadCapacity;

    }
    public void display_vehicle_details(){
        System.out.println("*****Truck*****");
        super.display_vehicle_details();
        System.out.println("Load Capacity: "+LoadCapacity+"tons");

    }
}
