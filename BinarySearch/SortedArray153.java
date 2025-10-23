package BinarySearch;
import java.util.*;

public class SortedArray153 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().trim().split("\\s+");
        int[] nums = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i] = Integer.parseInt(parts[i]);

        }
        System.out.println(findmin(nums));
    }
    public static int findmin(int[] nums){
        int left =0;
        int right = nums.length-1;
        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]<nums[right]){
                right = mid;
            }else{
                left = mid+1;
            }
        }return nums[left];
    }
}
