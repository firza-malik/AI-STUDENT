import java.util.Scanner;

public class Dice {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int dice1=(int)(6*Math.random()+1);
       int dice2=(int)(6*Math.random()+1);
       System.out.println("\nWellcome  to Guessing Dice");
       System.out.println("Sum of the both dice:"+" "+(dice1+dice2));
       int Guess1,Guess2,count=0;
       do{
         System.out.println("guess num of Dice1:");
         Guess1=sc.nextInt();
         System.out.println("guess num of Dice2:");
         Guess2=sc.nextInt();
         count++;
         if (Guess1==dice1&&Guess2==dice2) {
            System.out.println("Congratulation.....you win");
            System.out.println("You have successfully guessed in a 6 attampts");
            
         } else{
            System.out.println(":( Try again");
         }


       }while (Guess1!=dice1&&Guess2!=dice2) ;
        sc.close();
        
    }
    
}
