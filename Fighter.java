
import java.util.*;

public class Fighter {
    String name;
    int health;
    int attackPower;

    public Fighter(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.attackPower;
        System.out.print(this.name + " attacks ");
        System.out.print(opponent.name + " for ");
        System.out.println(this.attackPower + " damage!");

    }

    public boolean isAlive() {
        if (health > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("enter a ALi health:");
        int health = sc.nextInt();
        System.out.print("enter a ALi attacKPower:");
        int attackPower = sc.nextInt();
        System.out.print("enter a aisha health:");
        int health1= sc.nextInt();
        System.out.print("enter a Aisha attacKPower:");
        int attackPower1 = sc.nextInt();



        Fighter fighter1 = new Fighter("Ali", health,attackPower);
        Fighter fighter2 = new Fighter("Aisha", health1, attackPower1);
        sc.close();
        


        while (fighter1.isAlive() && fighter2.isAlive()) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);

            System.out.println("Remaining HP :");

            System.out.println(fighter1.name + ": " + fighter1.health);

            System.out.println(fighter2.name + ": " + fighter2.health);

        }

        if (fighter1.isAlive()) {
            System.out.println(fighter1.name + " wins!");
        } 
        else{
            System.out.println(fighter2.name + " wins!");
        }
    }
}
