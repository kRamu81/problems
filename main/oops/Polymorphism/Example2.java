package main.oops.Polymorphism;

public class Example2 {
    void area(int l,int b){
        int rectangle = l*b;
        System.out.println("Area of Reactangle:"+rectangle);
    }

    void area(int side){
        int square = side*side;
        System.out.println("Area of Square" + square);
    }

    void area(double r){
        double circle = 3.14259*r*r;
        System.out.println("Area of Circle:"+ circle);
    }

    void area(double h , double b){
        double triangle = 0.5*h*b;
        System.out.println("Area of Triangle is:"+triangle);
    }
    public static void main(String[] args) {
        Example2 obj = new Example2();
        obj.area(5,4);
        obj.area(3);
        obj.area(6.0);
        obj.area(7.0,3.0);
    }
}
