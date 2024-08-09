/*Create a BankAccount class with attributes like account number, balance, and account holder name.
Implement methods for depositing and withdrawing money, checking the balance, and displaying account details.
Create multiple BankAccount objects and perform banking operations.*/

package SimpleBankAccount;


public class BankAccount {
    public long accountnum;
    public double balance;
    public String name;
    BankAccount(long accountnum,double balance,String name){
        this.accountnum=accountnum;
        this.balance=balance;
        this.name=name;
    }
    public void Depositing(double amount ){
         
        this.balance+=amount;
        System.out.println("Deposit successful. New balance: $" + balance);
       

    }
    public void Withdrawing(double amount){
    
        if (amount <= balance) {  
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    
    }
    public void Checkingbalance(){
        System.out.println("Total Balance:"+balance);
    }
    public void Displaying(){
        System.out.println("Name:"+name);
        System.out.println("Account Number:"+accountnum);
        System.out.println("Total Balance:"+balance );
    }
    
}
