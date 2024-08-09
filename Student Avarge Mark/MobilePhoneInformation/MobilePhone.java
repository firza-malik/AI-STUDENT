package MobilePhoneInformation;
/*Create a MobilePhone class with attributes like brand, model, price, and storage capacity.
Implement methods to display phone details, compare prices of two phones, and check if a phone meets specific requirements (e.g., minimum storage).
Create an array of MobilePhone objects and find the phone with the highest storage capacity. */
public class MobilePhone {
    private String brand,model;
    private int price,storage_capacity;
    MobilePhone(String brand,String model,int price,int storage_capacity){
        this.storage_capacity=storage_capacity;
        this.brand=brand;
        this.price=price;
        this.model=model;
    }
    public void display(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Storage: "+storage_capacity+"GB");
        System.out.println("Price: "+price+"$");

        
    }
    public void Camparephones(MobilePhone phones){
        if(this.price>phones.price){
            System.out.println(this.model+"more expansive than"+phones.model);
        }else if (this.price<phones.price) {
            System.out.println(phones.model+"more expansive than"+this.model);
            
        }else{
            System.out.println(phones.model+"both phones price equal"+this.model);
        }

    }
    public void MinimumStorage(MobilePhone phones){
        if (this.storage_capacity<phones.storage_capacity) {
            System.out.println("minimum Storage:"+this.model+this.storage_capacity);     
        }else{
            System.out.println("minimum Storage:"+phones.model+phones.storage_capacity);
        }
    }

    

    
}

