package main.oops.StaticVariable;

class Calculator{
    public static int add(int a,int b){
        return a+b;
    }
}

public class Static_Method {
    public static void main(String[] args) {
        System.out.println("Add: " + Calculator.add(10, 5));
    }
}
