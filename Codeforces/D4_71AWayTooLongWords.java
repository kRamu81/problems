import java.util.*;

public class D4_71AWayTooLongWords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            String st = s.next();
            int n = st.length();
            if (n <= 10) {
                System.out.println(st);
            } else {
                System.out.println("" + st.charAt(0) + (n - 2) + st.charAt(n - 1));
            }
        }
        s.close();
    }
}
