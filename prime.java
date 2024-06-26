import java.util.*;

public class prime {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a num");
    int num=sc.nextInt();
    int i=0;
    int n=2;

   while (n<=num/2) {
      if(num%n==0){

        i++;
        break;
      }
      n++;
      
    }
     if(i==0){
       System.out.println(num+"its  a prime num");

      }
      else{
        System.out.println(num+"its not a prime num");
      }
   }  
    

  
  }
   