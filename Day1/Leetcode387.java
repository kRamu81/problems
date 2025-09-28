import java.util.*;
public class Leetcode387 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(firstUniqchar(str));
    }

    public static int firstUniqchar(String s){
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
/*
 * class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;  // return index, not character
            }
        }
        return -1; // if no unique character
    }
}

 */