import java.util.*;

public class SubarraywithGivenSum {
    // leetcode 560
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] nums = new int[parts.length];
        for(int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }

        int target = sc.nextInt();
        System.out.println(subarraySum(nums, target));
    }

    public static int subarraySum(int[] nums, int target) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum == target) {
                    count++;  // count subarray instead of returning
                }
            }
        }
        return count;  // number of subarrays
    }
}
