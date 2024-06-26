import java.util.*;

public class guess1{
    public static void main(String[]args){
        Random rand=new Random();
        int randomnum=rand.nextInt();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<=5;i++){       

            System.out.println("enter a num");
            int num1=sc.nextInt();
            if(randomnum==num1){
                System.out.println("congulation");
                break;
            }else if(randomnum>num1){               
                System.out.println("To high");
            }else if(randomnum<num1){
                System.out.println("To low");

            }

        }
        sc.close();

        System.out.println("Sorry try again!" + "random num:" + randomnum);





    }
    
}
