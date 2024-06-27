
import java.util.*;
 public class main {
     public static int added(int num, int num2){
       int add = num+num2;
       return add;
     }
     public static int mul(int num, int num2){
       int mult= num*num2;
       return mult;
     }
     public static int sub (int num,int num2){
       int subs=num-num2;
       return subs;
     }
     public static float div(float num,float num2){
         float divi= num/ num2;
         return divi;
     }
     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num:");
        int num=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("enter a opt:");
        char opt=sc.next().charAt(0);
        if (opt=='+'){
            int add=added(num,num2);
            System.out.print(add);
        }
        else if (opt=='*'){
            int mult=mul(num, num2);
            System.out.println(mult);
        }
        else if(opt=='-'){ 
           int subs=sub(num, num2);
           System.out.println(subs);
            
        }
        else{
            float divi=div(num,num2);
            System.out.println(divi);
        }
    }
}