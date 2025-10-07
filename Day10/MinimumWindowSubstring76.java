package Day10;
import java.util.*;

public class MinimumWindowSubstring76 {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minimumsubstring(s, t)); // Expected output: "BANC"
    }
    public static String minimumsubstring(String s, String t) {
        int[] fixedCount = new int[128];
        int[] freq = new int[128];
        int left = 0;
        int min = Integer.MAX_VALUE;
        String result = "";
        int dist = 0;

        for (int i = 0; i < t.length(); i++) {
            fixedCount[t.charAt(i)]++;
        }

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch]++;

            if (fixedCount[ch] > 0 && freq[ch] <= fixedCount[ch]) {
                dist++;
            }
            while (dist == t.length()) {
                if (min> right - left + 1 ) {
                    min = right - left + 1;
                    result = s.substring(left, right + 1);
                }
                char leftch = s.charAt(left);
                freq[leftch]--;
                if (fixedCount[leftch] > 0 && freq[leftch] < fixedCount[leftch]) {
                    dist--;
                }
                left++;
            }
        }
        return result;
    }
}
