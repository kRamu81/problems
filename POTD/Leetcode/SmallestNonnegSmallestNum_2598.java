package POTD.Leetcode;
import java.util.*;

public class SmallestNonnegSmallestNum_2598 {
    public static void main(String[] args) {
        int[] nums ={1,-10,7,13,6,8};
        int value = 5;
        System.out.println(smallestNumber(nums,value));
    }
    public static int smallestNumber(int[] nums,int value){
        int n = nums.length;
        Arrays.sort(nums);
        int count =0;
        int min = nums[0];
        for(int i=0;i<n;i++){
            if(nums[i]<min){
                min = nums[i];
                nums[i]= count++;
            }
        }
        return count;
    }
}
