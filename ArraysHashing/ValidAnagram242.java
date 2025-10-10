package Day3;
import java.util.*;

public class ValidAnagram242 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.next();
        String b = s.next();
        System.out.println(validAnagram(a,b));
    }
    public static boolean validAnagram(String s,String t){
        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1,c2);
    }
}
