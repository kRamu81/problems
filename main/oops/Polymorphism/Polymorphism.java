package main.oops.Polymorphism;

public class Polymorphism {
    //method overloading
    void payment(){
        System.out.println("Credit");
    }

    //passing parameter
    void payment(int num){
        System.out.println("Debit");
    }
    //passing no of parameter
    void payment(int n,String name){
        System.out.println("upi");
    }

    //changing seqence of parameters
    void payment(String name,int c){
        System.out.println("Cash on delivery");
    }

    //by changing datatype
    void payment(float a, char w){
        System.out.println("Paytm");
    }
    public static void main(String[] args) {
        Polymorphism obj = new Polymorphism();
        obj.payment();
        obj.payment(1);
        obj.payment(5,"ramu");
        obj.payment("ramu",3);
        obj.payment(5,'A');
    }

}
