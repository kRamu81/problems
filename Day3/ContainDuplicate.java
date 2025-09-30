package Day3;
import java.util.*;

public class ContainDuplicate {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String[] l = s.nextLine().split(" ");
        int[] nums = new int[l.length];
        for(int i=0;i<l.length;i++){
            nums[i] = Integer.parseInt(l[i]);
        }
        System.out.println(duplicate(nums));
    }

    public static boolean duplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
