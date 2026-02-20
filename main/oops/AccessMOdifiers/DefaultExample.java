package main.oops.AccessMOdifiers;

public class DefaultExample {
    int num =20;

    void display(){
        System.out.println("Default: "+num);
    }

    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.display();
    }
}
