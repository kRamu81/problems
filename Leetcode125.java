import java.util.*;
public class Leetcode125 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));

    }
    public static boolean isPalindrome(String s){
        StringBuilder filtered = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                filtered.append(Character.toLowerCase(c));
            }
        }
        String filteredStr = filtered.toString();
        String reversedStr = filtered.reverse().toString();
        return filteredStr.equals(reversedStr);
    }
}
