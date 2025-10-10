import java.util.*;

public class Leetcode442 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().trim().split("\\s+");
        int[] nums = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            nums[i] = Integer.parseInt(parts[i]);
        }

        System.out.println(findDuplicates(nums));
        s.close();
    }

    public static List<Integer> findDuplicates(int[] nums){
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length - 1;i++){
            if(nums[i]==nums[i+1]){
                lst.add(nums[i]);
                i++; 
            }
        }
        return lst;
    }
}
