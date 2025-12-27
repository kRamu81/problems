package String;
import java.util.*;

public class lc1573_SplitString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = s.next(); // example: 10101

        lc1573_SplitString obj = new lc1573_SplitString();
        int count = obj.ans(st);
        System.out.println(count);
    }

    private int ans(String s) {
        int n = s.length();
        int ones = 0;

        // Count number of 1s
        for (char c : s.toCharArray()) {
            if (c == '1') ones++;
        }

        // If cannot divide into 3 equal parts
        if (ones % 3 != 0) return 0;

        // All zeros case
        if (ones == 0) {
            int cuts = n - 1;
            return (cuts * (cuts - 1)) / 2;
        }

        // Each part must have these many 1s
        int onespart = ones / 3;

        int count = 0;
        int way1 = 0;
        int way2 = 0;

        // Count valid cut positions
        for (char c : s.toCharArray()) {
            if (c == '1') count++;

            if (count == onespart) way1++;
            else if (count == 2 * onespart) way2++;
        }

        return way1 * way2;
    }
}
