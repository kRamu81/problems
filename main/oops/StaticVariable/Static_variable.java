package main.oops.StaticVariable;
import java.util.*;

class BankAccount{
    String name;
    double accountbalance;

    static double totalbalance =0;

    BankAccount(String Accountname,double balance){
        name = Accountname;
        accountbalance = balance;
        totalbalance += accountbalance;
    }

    void deposit(double amount){
        accountbalance += amount;
        totalbalance += amount;
    }
    void accountDetails(){
        System.out.println("Accountholder" + name +"amountbalance"+ accountbalance);
    }

    void showTotalBalance(){
        System.out.println("totalbalance"+totalbalance);
    }
}
public class Static_variable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        BankAccount a = new BankAccount("Alice",2000);
        BankAccount b = new BankAccount("BOb",3000);

        double deposit1 = s.nextDouble();
        a.deposit(deposit1);

        double deposit2 = s.nextDouble();
        b.deposit(deposit2);

        a.accountDetails();
        a.showTotalBalance();

        b.accountDetails();
        b.showTotalBalance();

    }
}
