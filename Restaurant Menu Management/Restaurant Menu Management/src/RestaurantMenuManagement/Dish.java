/*Create a class named Dish with member variables for name, description 
(optional), price, and category (e.g., appetizer, main course).
o Design a class named RestaurantMenu that has an arraylist of Dish objects.
o Implement methods in RestaurantMenu to: 
 Add a new dish to the menu, ensuring unique names.
 Display all dishes categorized by type.
 Search for a dish by name and display its details (if found).
 Allow modification of dish details (price, description) based on name.*/
package RestaurantMenuManagement;
public class Dish {
    public String name,description,category;
    public Double price;
    Dish(String name,String description,String category,Double price){
        this.name=name;
        this.description=description;
        this.category=category;
        this.price=price;
 
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getcategory(){
        return category;

    }
    public Double getprice(){
        return price;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    public String toString() {
        return "Name: " + name + ", Description: " + description + ", Price: $" + price + ", Category: " + category;
    }
    
}                      