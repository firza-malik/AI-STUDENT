package ShapeHierarchy;

public class Circle extends Shape{
    public double radius;
    public Circle(double radius){
        this.radius=radius;

    }
    double calculateArea() {
         return (Math.PI*radius*radius);
    }
}
