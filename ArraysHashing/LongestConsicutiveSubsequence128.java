package Day5;
import java.util.*;

public class LongestConsicutiveSubsequence128 {
    public static void main(String[] args) {
        int[] nums = {100,1,2,200,3,4};
        System.out.println(longestConsecutive(nums));
    }
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n==0) return 0;
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]) continue;
            if(nums[i]==nums[i-1]+1){
                count++;
            }else{
                count = 1;
            }
            max = Math.max(max,count);
        }
        return max;
    }
}
