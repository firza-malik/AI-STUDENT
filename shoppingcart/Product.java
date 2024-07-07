/*o Create a class named Product with properties for name, price, and quantity in 
stock.
o Design a class named ShoppingCart that holds an array of Product objects 
representing a customer's cart.
o Implement methods in ShoppingCart to: 
 Add a product to the cart (check for availability).
 Update the quantity of an existing item.
 Remove an item from the cart.
 Calculate the total bill amount considering product prices and quantities.
 Print the cart contents with item names, quantities, and individual prices */


package shoppingcart;

public class Product {
    String name;
    int price;
    int quantity;

    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "name: " + getName() + " price: " + getPrice() + " quantity: " + getQuantity();
    }
}

