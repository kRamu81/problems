package Day6;

public class TrappingRainWater42 {
    public static void main(String[] args) {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }
    public static int trap(int[] height){
        int left =0;
        int right = height.length-1;
        int ans =0, leftmax =0 , rightmax =0;
        while(left<=right){
            leftmax = Math.max(leftmax,height[left]);
            rightmax = Math.max(rightmax,height[right]);

            if(leftmax<rightmax){
                ans += leftmax-height[left];
                left++;
            }else{
                ans += rightmax-height[right];
                right--;
            }
        }
        return ans;
    }
}
/*
using Two pointers
 */