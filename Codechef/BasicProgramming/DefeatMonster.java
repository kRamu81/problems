package Codechef.BasicProgramming;
import java.util.Scanner;

class DefeatMonster {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            long h = s.nextLong();
            long x = s.nextLong();
            long y = s.nextLong();

            if (x > y) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}