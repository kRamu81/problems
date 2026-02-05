package POTD.GFG;

public class Day05_maxSubarraySumK {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 5, 6};
        int k = 3;
        int n = nums.length;

        int sum = 0;

        // Step 1: Sum of first k elements
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;

        // Step 2: Slide the window
        for (int i = k; i < n; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
