package main.oops;

class Parent {
    void first() {
        System.out.println("Parent property");
    }
}

public class Single_inheritance extends Parent {
    void second() {
        System.out.println("Child property");
    }

    public static void main(String[] args) {
        Single_inheritance c = new Single_inheritance();
        c.second();
        c.first();
    }
}
