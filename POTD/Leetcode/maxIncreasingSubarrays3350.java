package POTD.Leetcode;
import java.util.*;

public class maxIncreasingSubarrays3350 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 5, 7, 8, 9, 2, 3, 4, 3, 1));
        System.out.println(subarraymax(nums));
    }
    public static int subarraymax(List<Integer> nums){
        int n = nums.size();
        int[] left = new int[n];
        Arrays.fill(left, 1);
        for (int i = 1; i < n; i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                left[i] = left[i - 1] + 1;
            }
        }

        int[] right = new int[n];
        Arrays.fill(right, 1);
        for (int i = n - 2; i >= 0; i--) {
            if (nums.get(i) < nums.get(i + 1)) {
                right[i] = right[i + 1] + 1;
            }
        }

        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            ans = Math.max(ans, Math.min(left[i], right[i + 1]));
        }
        return ans;
    }
}
