/*Scenario: Build a vehicle rental service system where different types of vehicles (Cars, Bikes) can be rented. Each vehicle has a unique ID, model, and rental price.
Concepts: Classes, Inheritance, Interface
Task: Create an interface Rentable with a method calculateRent. Implement this interface in Car and Bike classes, which inherit from a base class Vehicle. */
package VehicleRentalService;

public  class Vehicle {
    private String uniqueID;
    private String model;
    private double rentalPrice; 
    public Vehicle(String uniqueID, String model, double rentalPrice) {
        this.uniqueID = uniqueID;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }
    public String getModel() {
        return model;
    }

    public String getUniqueID() {
        return uniqueID;
    }

}


