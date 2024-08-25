package VehicleInheritance;

public class Main {
    public static void main(String[] args) {
        Vehicle []vehicles= new Vehicle[3];
        vehicles[0]=new Car("Revo", 2020, "black", 4);
        vehicles[1]=new Motorcycle( 1200, "125", 2024, "black");
        vehicles[2]=new Truck("ABC", 2013, "White", 3);
        for (Vehicle vehicle : vehicles) {
            vehicle.display_vehicle_details();
            
        }
        
    }
    
}
