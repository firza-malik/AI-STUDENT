package ShapeHierarchy;
/* Create a class named Shape with a method to calculate area (abstract).
 Create subclasses for Circle, Rectangle, and Triangle inheriting from Shape.
 Implement the calculateArea() method in each subclass accordingly.
 Create an array of Shape objects and calculate the total area of all shapes. */
abstract class Shape {
    abstract double calculateArea();  
}
