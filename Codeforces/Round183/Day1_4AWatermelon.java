package Codeforces.Round183;
import java.util.Scanner;

public class Day1_4AWatermelon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int w = input.nextInt();
        if (w > 2 && w % 2 == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
