package BasicShape;

 class Triangle extends Shape{
    private double base;
    private double heigth;
    Triangle(double base,double heigth){
        this.base=base;
        this.heigth=heigth;
        
    }
    double Calculate(){
        System.out.print("Trigle");
        return 0.5*base*heigth;
    }
    
}
