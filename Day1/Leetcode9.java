import java.util.Scanner;
public class Leetcode9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x){
        if(x<0) return false;
        int original = x;
        int reversed = 0;
        while(x != 0){
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }
        return original==reversed;
    }
}
/* // User function Template for Java

class Solution {
    public boolean isPalindrome(int n) {
        // code here
        if (n < 0) return false;   // negative numbers are not palindrome
        String s = String.valueOf(n);
        String rev = "";           // fixed: no space, start with empty string

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);    // build reversed string
        }
        return s.equals(rev);
    }
} */