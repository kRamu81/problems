package main.oops;

class Gparent{
    void age(){
        System.out.println("age 70");
    }
}

class Multilevel_parent extends Gparent{
    void age1(){
        System.out.println("age is 40");
    }
}

public class Multilevel_inheritance extends Multilevel_parent{
    void age2(){
        System.out.println("Age is 20");
    }
    public static void main(String[] args){
        Multilevel_inheritance m =  new Multilevel_inheritance();
        m.age();
        m.age1();
        m.age2();
    }
}
