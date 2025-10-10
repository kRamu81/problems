package Day3;
import java.util.*;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1. Read numbers from input
        String[] list = s.nextLine().split(" ");
        int[] nums = new int[list.length];
        for(int i=0;i<list.length;i++){
            nums[i] = Integer.parseInt(list[i]);
        }
        int k = s.nextInt();

        int[] ans = topFrequent(nums,k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] topFrequent(int[] nums,int k){
        // Step 1: Store frequency of each number in map
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Step 2: Convert keys into list
        List<Integer> list = new ArrayList<>(map.keySet());

        // Step 3: Sort list based on frequency (descending order)
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        // Step 4: Pick top k elements
        int[] result = new int[k];
        int index = 0;
        for(int i=0;i<k;i++){
            result[index] = list.get(i);
            index++;
        }

        return result;
    }
}
