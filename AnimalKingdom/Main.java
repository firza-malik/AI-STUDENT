package AnimalKingdom;
/* Create an array of Animal objects and demonstrate polymorphism by calling the makeSound()
method on each object. */
 

public class Main {
    public static void main(String[] args) {
        Animal[] animals= new Animal[3];
        animals[0] =new Dog();
        animals[1] = new Cat();
        animals[2] = new Brids();
        for (Animal Animals : animals) {
            Animals.AnimalSound();
            
        }

        

        
    }
    
}
