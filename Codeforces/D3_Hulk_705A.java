package Codeforces;
import java.util.*;

public class D3_Hulk_705A {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1)
                sb.append("I hate");
            else
                sb.append("I love");

            if (i != n)
                sb.append(" that ");
            else
                sb.append(" it");
        }
        System.out.println(sb.toString());

    }
}
