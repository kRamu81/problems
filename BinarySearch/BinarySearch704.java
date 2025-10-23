package BinarySearch;
import java.util.*;

public class BinarySearch704 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] l = s.nextLine().split(" ");
        int[] nums = new int[l.length];
        for(int i = 0; i < l.length; i++){
            nums[i] = Integer.parseInt(l[i]);
        }
        int target = s.nextInt();
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;}

}
