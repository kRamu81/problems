package POTD.GFG;

public class Day06_maxSubarrayXOR {
    public static void main(String[] args) {
        int[] nums ={1,2,4,5,6};
        int k = 2;
        System.out.println(solve(nums,k));
    }
    public static int solve(int[] nums, int k){
        int n = nums.length;
        int xor =0;
        int max =0;
        for(int i=0;i<k;i++){
            xor ^= nums[i];
        }
        max = xor;
        //sliding window
        for(int i=k;i<n;i++){
            xor ^= nums[i-k]; //remove last element
            xor ^= nums[i];//add the next element
            max = Math.max(max,xor);
        }

        return max;

    }
}
