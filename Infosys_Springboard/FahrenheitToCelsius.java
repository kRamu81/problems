package Infosys_Springboard;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input temperature in Fahrenheit
        double fahrenheit = sc.nextDouble();

        // Convert to Celsius
        double celsius = ((fahrenheit - 32) / 9) * 5;

        // Display output
        System.out.println(celsius);

        sc.close();
    }
}

