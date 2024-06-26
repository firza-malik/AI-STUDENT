import java.util.Scanner;

public class BreakCondition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int run1=0;
        int batmens=11;
        System.out.println("wellocome to Cricket scorekeeper!");
        while (true) {
            System.out.println("enter a run/out:");
    

            
            String ball=sc.nextLine();
            if(ball=="run"){
                run1++;
                System.out.println("Score"+run1 );
            }
            else if(ball=="out") {
                System.out.println("out:LBW,bowled,caught");
                String outs=sc.nextLine();
                if(outs=="LBW"){
                    System.out.println("LBW");
                    batmens--;
                }else if(outs=="bowled"){
                    System.out.println("bowled");
                    batmens--;
                }else if(outs=="caught"){
                    System.out.println("caught"+ batmens);
                    batmens--;
                    
                }

            }
            
        }




        
    }
    
}
