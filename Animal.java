/*Create a class named Animal with a method to make a sound. Create subclasses for Dog
and Cat that override the makeSound method with specific animal sounds. */
// Define the Animal class with a method Sound
public class Animal {
    public void Sound() {
    }
}

class Cat extends Animal {
    @Override
    public void Sound() {
        System.out.println("meow meow!");
    }
}

class Dog extends Animal {
    @Override
    public void Sound() {
        System.out.println("woof woof!");
    }
}



