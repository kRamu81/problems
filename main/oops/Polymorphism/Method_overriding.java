package main.oops.Polymorphism;
// Method overriding is when a child class provides a
// new implementation of a method that is already defined in its parent class.
//Key points of Method Overriding
//Happens in Inheritance
//Method name must be same
//Parameters must be same
//Return type must be same or compatible
//Used for runtime polymorphism
//@Override is optional but recommended

class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}
public class Method_overriding {
    public static void main(String[] args) {
        Dog d  = new Dog();
        d.sound();

    }
}
