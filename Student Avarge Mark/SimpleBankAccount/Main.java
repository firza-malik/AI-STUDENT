package SimpleBankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account1=new BankAccount(123567, 200000,  "BUshra");
        account1.Checkingbalance();
        account1.Depositing(300);
        account1.Checkingbalance();
        account1.Withdrawing(4000);
        account1.Displaying();


        BankAccount account2=new BankAccount(234679, 600900, "jawaria");
        account2.Checkingbalance();
        account2.Depositing(50000);
        account2.Checkingbalance();
        account2.Withdrawing(300);
        account2.Displaying();


    }
    
}
    

