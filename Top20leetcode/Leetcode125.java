import java.util.*;
public class Leetcode125 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }

        }
        String original = sb.toString();
        String rev = sb.reverse().toString();
        return original.equals(rev);
    }
}
