package main.oops.AccessMOdifiers;

public class ProtectedExample {
    protected int num =0;

    protected  void display(){
        System.out.println("Protected: "+num);
    }
    static class B extends ProtectedExample{
        public static void main(String[] args) {
            B obj = new B();
            obj.display();
            System.out.println(obj.num);

        }
    }
}
