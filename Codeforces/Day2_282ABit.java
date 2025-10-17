package Codeforces;
import java.util.Scanner;

public class Day2_282ABit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        int n = ip.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++) {
            String s = ip.next();
            if (s.contains("+")) x++;
            else x--;
        }
        System.out.println(x);
    }

}
