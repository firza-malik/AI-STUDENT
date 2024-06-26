import java.util.*;

public class Cal {
    public int num1, num2;

    Cal(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int added() {
        return num1 + num2;
    }

    public int mul() {
        return num1 * num2;
    }

    public int sub() {
        return num1 - num2;
    }

    public float div() {
        if (num2 != 0) {
            return (float) num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        Cal cal1 = new Cal(num1, num2);
        
        System.out.println("Addition: " + cal1.added());
        System.out.println("Multiplication: " + cal1.mul());
        System.out.println("Subtraction: " + cal1.sub());
        System.out.println("Division: " + cal1.div());
        
        sc.close();
    }
}
