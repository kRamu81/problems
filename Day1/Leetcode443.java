import java.util.*;

public class Leetcode443 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().trim();
        char[] chars = str.toCharArray();

        int len = compress(chars);

        // Print compressed array in LeetCode style
        System.out.print("[");
        for(int i = 0; i < len; i++){
            System.out.print("\"" + chars[i] + "\"");
            if(i < len - 1) System.out.print(",");
        }
        System.out.println("]");

        s.close();
    }

    public static int compress(char[] chars){
        int index = 0;
        int start = 0;
        int n = chars.length;

        while(start < n){
            int end = start;
            while(end < n && chars[start] == chars[end]){
                end++;
            }
            int count = end - start;
            chars[index++] = chars[start];

            if(count > 1){
                String cnt = Integer.toString(count);
                for(char c : cnt.toCharArray()){
                    chars[index++] = c;
                }
            }
            start = end;
        }
        return index;
    }
}
