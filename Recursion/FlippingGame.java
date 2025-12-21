package Recursion;

import java.util.Scanner;

class FlippingGame{
    public static int countWays(int s) {
        // Write your code here
        if(s<0) return 0;
        if(s==0) return 1;
        return countWays(s-1)+countWays(s-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        System.out.println(countWays(S));
    }
}