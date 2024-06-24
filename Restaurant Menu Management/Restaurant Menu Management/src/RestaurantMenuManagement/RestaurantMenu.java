package RestaurantMenuManagement;

import java.util.ArrayList;

public class RestaurantMenu {
    private ArrayList<Dish> dishes;

    public RestaurantMenu() {
        dishes = new ArrayList<>();
    }

    // Find dish by name
    public Dish findDishByName(String name) {
        for (Dish dish : dishes) {
            if (dish.getName().equalsIgnoreCase(name)) {
                return dish;
            }
        }
        return null;
    }

    // Add dish
    public void addDish(String name, String description, String category, double price) {
        if (findDishByName(name) == null) {
            dishes.add(new Dish(name, description, category, price));
            System.out.println("Dish added successfully.");
        } else {
            System.out.println(name + ": Dish already exists.");
        }
    }

    // Display all dishes
    public void displayDishes() {
        for (Dish dish : dishes) {
            System.out.println(dish);
        }
        System.out.println();
    }

    // Modify dish details
    public void modifyDish(String name, String newDescription, String newCategory, double newPrice) {
        Dish dish = findDishByName(name);
        if (dish != null) {
            dish.setDescription(newDescription);
            dish.setCategory(newCategory);
            dish.setPrice(newPrice);
            System.out.println("Dish details modified successfully!");
        } else {
            System.out.println(name + " not found.");
        }
    }

    public static void main(String[] args) {
        RestaurantMenu menu = new RestaurantMenu();
        menu.addDish("Cake", "Chocolate", "Dessert", 25.70);
        menu.addDish("Pasta", "Creamy Alfredo pasta", "Main Course", 12.99);
        menu.addDish("Caesar Salad", "Fresh Caesar salad", "Appetizer", 7.99);
        menu.addDish("Tiramisu", "Classic Italian dessert", "Dessert", 5.99);

        System.out.println("Displaying dishes by category:");
        menu.displayDishes();

        System.out.println("Modifying 'Pasta' details:");
        menu.modifyDish("Pasta", "Delicious creamy Alfredo pasta", "Main Course", 13.99);
        menu.displayDishes();
    }
}
