import java.util.*;
public class Leetcode242 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.println(checkAnagram(a,b));
    }
    public static boolean checkAnagram(String a, String b){
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
