package BinarySearch;
import java.util.*;

public class kokobananas875 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().trim().split("\\s+");
        int[] nums = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        int h = s.nextInt();
        System.out.println(ans(nums,h));
    }
    public static int ans(int[] nums,int h){
        int min = 1;
        int max = Arrays.stream(nums).max().getAsInt();
        while(min<max){
            int mid = min+(max-min)/2;
            int hoursneed = 0;
            for(int num : nums){
                hoursneed += (int) Math.ceil((double) num / mid);
            }
            if(hoursneed<=h) max=mid;
            else min = mid+1;
        }
        return min;
    }
}
