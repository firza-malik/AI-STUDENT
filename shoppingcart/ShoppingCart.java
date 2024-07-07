package shoppingcart;
import java.util.*;

public class ShoppingCart {
    private ArrayList<Product> cart;

    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Add product
    public void addProduct(String name, int price, int quantity) {
        for (Product product : cart) {
            if (product.getName().equals(name)) {
                System.out.println(name + " product is already added");
                return;
            }
        }
        cart.add(new Product(name, price, quantity));
    }

    // Update product
    public void updateProduct(String name, String newName, int newPrice, int newQuantity) {
        for (Product product : cart) {
            if (product.getName().equals(name)) {
                product.setName(newName);
                product.setPrice(newPrice);
                product.setQuantity(newQuantity);
                return;
            }
        }
        System.out.println(name + " is not found");
    }

    // Remove product
    public void removeProduct(String name) {
        for (Product carts : cart) {
            if(carts.getName().equals(name)){
                cart.remove(carts);
                System.out.println(name+"remove successfully");

            }
            
        }
        
        System.out.println(name+"is not found");
        
        
    }

    // Total bill
    public void totalBill() {
        int total = 0;
        for (Product product : cart) {
            total += product.getPrice() * product.getQuantity();
        }
        System.out.println("Total bill: " + total);
    }

    // Display products
    public void displayProduct() {
        for (Product product : cart) {
            System.out.println(product);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ShoppingCart firzacart = new ShoppingCart();
        firzacart.addProduct("shoes", 2300, 2);
        firzacart.addProduct("bug", 200, 1);
        firzacart.addProduct("Abya", 4000, 5);
        System.out.println("-------------------");
        firzacart.displayProduct();
        firzacart.removeProduct("bug");
        System.out.println("---------------------");
        firzacart.displayProduct();
        firzacart.updateProduct("shoes","bug",4000,1);
        System.out.println("-------------------");
        firzacart.displayProduct();
        firzacart.totalBill();
    }
}
