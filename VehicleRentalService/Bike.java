package VehicleRentalService;

public class Bike extends Vehicle implements Rantable {

    
    public Bike(String unique_Id, String model, double rental_price){
        super(unique_Id, model, rental_price);
    }

    
    public double calculateRent(int duration) {
        return duration * getRentalPrice();  
    }
    public void display(){
        System.out.println("*****Bike Rant*****");
        System.out.println("Model: "+getModel());
        System.out.println("Unique Id: "+getUniqueID());
        System.out.println("rant price for Bike: "+getRentalPrice());



    }
}
