package ShapeHierarchy;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 6),
            new Triangle(3, 7)
        };  
        double totalArea = 0;
        for (Shape shape : shapes) {     
            totalArea += shape.calculateArea();
        }
        System.out.println("Total area of all shapes: " + totalArea);
    }
}
