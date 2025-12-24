package Infosys_Springboard;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println(area);

        sc.close();
    }
}

