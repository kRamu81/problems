package main.oops;
class parent{
    void p1(){
        System.out.println("I am parent");
    }
}

class child1 extends parent{
    void c1(){
        System.out.println("I am first child");
    }
}

class child2 extends parent{
    void c2(){
        System.out.println("I am second child");
    }
}

public class Hirerical_inheritance extends parent{
    void c3(){
        System.out.println("I am third child");
    }

    public static void main(String[] args) {
        Hirerical_inheritance h = new Hirerical_inheritance();
        h.p1();
        h.c3();

        System.out.println("------");
        child1 a = new child1();
        a.p1();
        a.c1();

        System.out.println("-----");
        child2 b = new child2();
        b.p1();
        b.c2();
    }
}
