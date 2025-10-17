
import java.util.*;

public class PermutationinString567 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.next();//ab
        String s2 = s.next();//eidbaooo
        System.out.println(permutationofString(s1,s2));
    }
    public static boolean permutationofString(String s1, String s2){
        if(s1.length()>s2.length()) return false;
        int[] freq = new int[26];
        int[] window = new int[26];
        for(int i=0;i<s1.length();i++){// count the freq of the character
            freq[s1.charAt(i)-'a']++;
            window[s2.charAt(i)-'a']++;
        }
        //using sliding window
        for(int i=s1.length();i<s2.length();i++){
            // if both are equal directly return true
            if(Arrays.equals(freq,window)) return true;
            //not same update right add and left remove
            window[s2.charAt(i)-'a']++;// adding right side update
            window[s2.charAt(i-s1.length())-'a']--;//remove the left character
        }
        return Arrays.equals(freq,window);
    }
}
