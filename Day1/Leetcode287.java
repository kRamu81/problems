import java.util.*;
public class Leetcode287 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().trim().split("\\s+");
        int[] num = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            num[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(findDuplicate(num));
    }

    public static int findDuplicate(int[] num){
        int n = num.length;
        Arrays.sort(num);
        for(int i=0;i<n;i++){
            if(num[i]==num[i+1]) return num[i];
        }
        return -1;
    }
}
