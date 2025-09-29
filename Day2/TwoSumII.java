
import java.util.*;
//leetcode 167
public class TwoSumII {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().trim().split("\\s+");
        int[] num = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            num[i]= Integer.parseInt(parts[i]); 
        }
        int target = sc.nextInt();
        int[] ans = twoSum(num,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums,int target){
        int left = 0;
        int right = nums.length-1; 
        while(left<right){
            int sum = nums[left]+nums[right];
            if(sum==target){
                return new int[]{left+1,right+1}; 
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}