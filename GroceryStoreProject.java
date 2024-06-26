import java.security.*;

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }
}

class GroceryStore {
    Product[] inventory = new Product[10];

    public void addProduct(String name, double price, int quantity, int index) {
        Product newProduct = new Product(name, price, quantity);
        inventory[index] = newProduct;
    }    

    public Product searchProductByName(String searchName, Product[] products) {
        for(Product product : products) {
            if(product != null && product.getName().equalsIgnoreCase(searchName)) {
                return product;
            }
        }
        return null; // Return null if the product is not found
    }

    public void showProducts() {
        for(int i = 0; i < inventory.length; i++) {
            if(inventory[i] != null) { // Check if product exists at this index
                System.out.println("Name: " + inventory[i].name);
                System.out.println("Price: " + inventory[i].price);
                System.out.println("Quantity: " + inventory[i].quantity);
                System.out.println(); // Add a line break for readability
            }
        }
    }
}

public class GroceryStoreProject {
    public static void main(String[] args) {
        GroceryStore store1 = new GroceryStore();
        store1.addProduct("Laptop DELL E25", 50000, 100, 0);
        store1.addProduct("Laptop HP H25", 60000, 80, 1);
        
        // Searching for a product
        Product foundProduct = store1.searchProductByName("Laptop DELL E25", store1.inventory);
        if(foundProduct != null) {
            System.out.println("Product found:");
            System.out.println("Name: " + foundProduct.name);
            System.out.println("Price: " + foundProduct.price);
            System.out.println("Quantity: " + foundProduct.quantity);
        } else {
            System.out.println("Product not found");
        }
        
        // Displaying all products
        System.out.println("\nAll Products:");
        store1.showProducts();
    }
}
