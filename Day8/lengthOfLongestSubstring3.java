package Day8;
import java.util.*;

public class lengthOfLongestSubstring3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthofLongestsubstring(s));
    }

    public static int lengthofLongestsubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int start = 0;
        int end =0;
        int maxlength = 0;
        for (end = 0; end < n; end++) {
            char c = s.charAt(end);
            while (set.contains(c)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(c);
            maxlength = Math.max(maxlength, end - start + 1);
        }
        return maxlength;
    }
}
