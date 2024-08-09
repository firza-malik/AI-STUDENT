package BasicShape;

 class Circle extends Shape{
    private double radius; 
    Circle(double radius){
        this.radius=radius;

    }
    double Calculate(){
        System.out.print("Circle");
        return 3.16*radius*radius;

    }
 
    
}
