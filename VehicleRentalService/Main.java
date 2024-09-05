package VehicleRentalService;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------");
        System.out.println("****** Vehicle Rental Service System ******");
        System.out.println("------------------------------------------------------");
        Bike bike=new Bike("A12", "125", 200);
        Car car=new Car("C14", "Revo", 1000);
        bike.display();
        System.out.println("total rant for Bike: "+bike.calculateRent(24)+"$");
        System.out.println();
        car.display();
        System.out.println("total rant for Bike: "+car.calculateRent(12)+"$");

    }
    
}
