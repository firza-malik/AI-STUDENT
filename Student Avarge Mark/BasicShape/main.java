package BasicShape;

 class main {
    public static void main(String[] args) {
        Shape[] shapes={
            new Circle(5),
            new Rectangle(4,3),
            new Triangle(8, 2)

        };
        for (Shape Shapes : shapes) {
            System.out.println("Aera:"+
            ""+Shapes.Calculate());
            
        }

        
    }
    
}
