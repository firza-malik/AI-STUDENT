import java.util.*;

public class fuction {
    public static int Mul(int num1, int num2) {
        int mult = num1 * num2;
        return mult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int mult = Mul(num1, num2);
        System.out.println("Product of num1 and num2: " + mult);
    }
}
