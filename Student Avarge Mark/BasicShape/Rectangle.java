package BasicShape;

 class Rectangle extends Shape {
    private double width;
    private double heigth;
    Rectangle(double width,double heigth){
        this.width=width;
        this.heigth=heigth;
    }
    double Calculate(){
        System.out.print("Rectangle");
        return heigth*width;
    }

    
}
