package ShapeHierarchy;

public class Triangle extends Shape {
    public double b,h;

    public Triangle(double b,double h){
        this.b=b;
        this.h=h;
        
    }

    double calculateArea(){
        return h*b/2;
    }
    
}
