package main.oops.Inheritance;

interface A {
    void withdraw();
}
interface B {
    void deposit();
}


public class Multiple_Inheritance implements A, B {

    public void withdraw() {
        System.out.println("Withdraw the money from ATM");
    }

    public void deposit() {
        System.out.println("Amount deposited");
    }

    public static void main(String[] args) {
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.withdraw();
        obj.deposit();
    }
}
