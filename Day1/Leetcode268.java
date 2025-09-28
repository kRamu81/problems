import java.util.*;
public class Leetcode268 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().trim().split("\\s+");
        int n = parts.length;
        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(missingNumber(num));
    }
    public static int missingNumber(int[] num){
        int n = num.length;
        int total = n*(n+1)/2;
        int sum =0;
        for(int i=0;i<n;i++){
            sum += num[i];
        }
        return total-sum;
    }    
}
