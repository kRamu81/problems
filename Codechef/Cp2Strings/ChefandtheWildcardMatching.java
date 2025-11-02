import java.util.*;

public class ChefandtheWildcardMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            String X = sc.next();
            String Y = sc.next();

            boolean match = true;
            for (int i = 0; i < X.length(); i++) {
                char a = X.charAt(i);
                char b = Y.charAt(i);

                // If both are different and neither is '?', not a match
                if (a != b && a != '?' && b != '?') {
                    match = false;
                    break;
                }
            }

            System.out.println(match ? "Yes" : "No");
        }
        sc.close();
    }
}