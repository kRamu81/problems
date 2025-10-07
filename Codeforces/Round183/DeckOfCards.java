import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), k = sc.nextInt();
            String s = sc.next();
            int minTop = 0, maxTop = 0, minBot = 0, maxBot = 0;

            for (char c : s.toCharArray()) {
                if (c == '0') { minTop++; maxTop++; }
                else if (c == '1') { minBot++; maxBot++; }
                else { maxTop++; maxBot++; } // '2'
            }

            StringBuilder res = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                boolean mustRemove = (i <= minTop) || (i > n - minBot);
                boolean canRemove = (i <= maxTop) || (i > n - maxBot);
                if (mustRemove) res.append('-');
                else if (!canRemove) res.append('+');
                else res.append('?');
            }
            System.out.println(res);
        }
    }
}
