import java.util.*;
public class Leetcode172 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(trailingZeros(n));
    }

    public static int trailingZeros(int n){
        int count = 0;
        while(n>0){
            n /= 5;
            count += n;
        }
        return count;
    }
}
