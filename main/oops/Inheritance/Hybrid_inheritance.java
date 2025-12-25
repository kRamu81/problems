package main.oops;

class parent1 {
    void p1() {
        System.out.println("I am parent");
    }
}

class child11 extends parent1 {
    void z1() {
        System.out.println("I am child1");
    }
}

class child12 extends parent1 {
    void z2() {
        System.out.println("I am second child");
    }
}

public class Hybrid_inheritance extends child12 {
    void z3() {
        System.out.println("I am subchild of child2");
    }

    public static void main(String[] args) {

        Hybrid_inheritance a3 = new Hybrid_inheritance();
        a3.p1();
        a3.z2();
        a3.z3();

        System.out.println("-----------");

        child12 a1 = new child12();
        a1.p1();
        a1.z2();

        System.out.println("------------");

        child11 a2 = new child11();
        a2.z1();
        a2.p1();
    }
}
