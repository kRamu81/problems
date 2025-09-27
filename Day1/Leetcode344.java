import java.util.Scanner;

public class Leetcode344 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char[] arr = str.toCharArray();
        System.out.println(reverseString(arr));
    }

    public static String reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;
        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return new String(s);  
    }
}
