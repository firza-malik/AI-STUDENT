import java.util.*;
import java.util.Random;
public class Guess {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) { 
            System.out.println("Enter a number:");
            int guess = sc.nextInt();
            if (guess == randomNum) {
                System.out.println("Congratulations, you guessed it!");
                break;
            } 
            else if (guess < randomNum) {
                System.out.println("Too low!");
            } 
            else {
                System.out.println("Too high!");
            }
            
        }
        sc.close();
        
        System.out.println("Sorry try again!" + "random num:" + randomNum);
    }
}
