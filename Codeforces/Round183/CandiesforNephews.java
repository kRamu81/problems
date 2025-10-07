package Codeforces.Round183;
import java.util.*;

public class CandiesforNephews {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int result = (3 - (n % 3)) % 3;
            System.out.println(result);
        }
        s.close();
    }
}
