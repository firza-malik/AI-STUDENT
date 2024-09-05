package VehicleRentalService;

public class Car extends Vehicle implements Rantable {

    
    public Car (String unique_Id, String model, double rental_price){
        super(unique_Id, model, rental_price);
    }

    
    public double calculateRent(int duration) {
        return duration * getRentalPrice();  
    }
    public void display(){
        System.out.println("*****Car Rant*****");
        System.out.println("Model: "+getModel());
        System.out.println("Unique Id: "+getUniqueID());
        System.out.println("rant price for Car: "+getRentalPrice());



    }
}
