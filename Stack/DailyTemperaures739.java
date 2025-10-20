package Stack;
import java.util.*;

public class DailyTemperaures739 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().trim().split("\\s+");
        int[] nums = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(Arrays.toString(DailyTemp(nums)));
    }
    public static int[] DailyTemp(int[] temp){
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> stack= new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temp[i]>temp[stack.peek()]){
                int prev = stack.pop();
                ans[prev] = i-prev;
            }
            stack.add(i);
        }
        return ans;
    }
}
