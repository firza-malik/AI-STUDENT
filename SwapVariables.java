public class SwapVariables {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    
        a=a+b;
        b = a-b ; 
        a = a-b;
 
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
