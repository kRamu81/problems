package Day5;
import java.util.*;

public class ValidPalindrome125 {
    public static void main(String[] args) {
        String s ="Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s){
        int left =0;
        int right = s.length()-1;
        while(left<right){
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while(left<right && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;

        /*
        // method 2 : Using String Builder
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String original = sb.toString();
        String rev = sb.reverse().toString();
        return original.equals(rev);
         */
    }
}
