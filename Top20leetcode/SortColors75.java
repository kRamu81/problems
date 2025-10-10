import java.util.*;

public class SortColors75 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().split(" ");
        int[] nums = new int[parts.length];
        for(int i = 0; i < parts.length; i++){
            nums[i] = Integer.parseInt(parts[i]);
        }

        sortColors(nums); // sort in-place
        System.out.println(Arrays.toString(nums)); // print result
    }

    public static void sortColors(int[] nums){
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
