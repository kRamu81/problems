package main.oops.AccessMOdifiers;

public class PrivateExample {
    private int num =20;
    private void display(){
        System.out.println("private:"+ num);
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        obj.display();
        System.out.println(obj.num);
    }
}
