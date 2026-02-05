package POTD.GFG;
import java.util.*;

public class Day07_countDistinctArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        System.out.println(count(nums, k)); // [3, 4, 4, 3]
    }

    static List<Integer> count(int[] nums, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        // 1️⃣ First window
        for (int i = 0; i < k; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        ans.add(map.size());

        // 2️⃣ Sliding window
        for (int i = k; i < n; i++) {

            // Remove outgoing element
            int out = nums[i - k];
            map.put(out, map.get(out) - 1);
            if (map.get(out) == 0) {
                map.remove(out);
            }

            // Add incoming element
            int in = nums[i];
            map.put(in, map.getOrDefault(in, 0) + 1);

            // Store answer
            ans.add(map.size());
        }

        return ans;
    }
}
