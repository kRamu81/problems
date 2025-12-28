package main.oops.Encapsulation;

class Car {
    public String model;
    public String color;
    public int year;
}

public class PublicAccess {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Sedan";
        myCar.color = "Red";
        myCar.year = 2023;

        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Color: " + myCar.color);
        System.out.println("Car Year: " + myCar.year);
    }
}