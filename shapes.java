/* Create a class named Shape with a member variable for color. Create a subclass named 
Rectangle inheriting from Shape with member variables for length and width. 
Implement a method in Rectangle to calculate its area. */

public class shapes {
    public String color;
    public shapes(String color){
        this.color=color;

    }
}
class rectangle extends shapes {
    public int length,width;
    public rectangle (int length,int width,String color){
        super(color);
        this.length=length;
        this.width=width;
    }
    public int calculateArea(){
          return length*width;
    }

    public static void main(String[] args) {
        rectangle rec1= new rectangle(12, 13, "black");
        int area=rec1.calculateArea();
        System.out.println("AREA:"+area);
        
    }
    
}
