package Day3;
import java.util.*;

public class Twosum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] l = s.nextLine().split(" ");
        int[] nums = new int[l.length];
        for (int i = 0; i < l.length; i++) {
            nums[i] = Integer.parseInt(l[i]);
        }
        int target = s.nextInt();
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int compliment = target - nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
