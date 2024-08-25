package ShapeHierarchy;

public class Rectangle extends Shape {
    public double l,w;
    public Rectangle(double l,double w){
        this.l=l;
        this.w=w;

    }
    double calculateArea() {
        return (l*w);
        
    }
    
}
