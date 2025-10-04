package POTD.Leetcode;

import java.util.Scanner;

public class ContainerWithMostwater11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().trim().split("\\s+");
        int[] nums = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(maxArea(nums));

    }
    public static int maxArea(int[] height){
        int left =0;
        int right = height.length-1;
        int maxarea = 0;
        while(left< right){
            int currentheight = Math.min(height[left],height[right]);
            int width = right- left;
            int area = currentheight * width;
            maxarea = Math.max(maxarea,area);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}
/*
[1,8,6,2,5,4,8,3,7]
// using two pointers initially max area = 0
// loop while left < right
// current height = min(height[left], height[right])
// width = right - left
// area = height * width
// max area = max(max area, area)
// if height[left] < height[right] then left++ else right--
// finally return max area


 */