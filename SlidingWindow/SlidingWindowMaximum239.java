package SlidingWindow;
import java.util.*;

public class SlidingWindowMaximum239 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] parts = s.nextLine().trim().split("\\s+");
        int[] nums = new int[parts.length];
        for(int i=0;i<parts.length;i++){
            nums[i] = Integer.parseInt(parts[i]);
        }
        int k = s.nextInt();
        System.out.println(Arrays.toString(maximum(nums,k)));
    }
    public static int[] maximum(int[] nums,int k){
        int n = nums.length;
        int[] res = new int[n-k+1];
        Deque<Integer> q = new ArrayDeque<>();
        int index = 0;
        for(int i=0;i<n;i++){
            //while q is not empty and q lastpeek value is lessthan current value then remove that
            while(!q.isEmpty() && nums[q.peekLast()]<nums[i]){
                q.pollLast();
            }
            q.offerLast(i);
            if(q.peekFirst() <= i-k){
                q.pollFirst();
            }
            // Store result once first window is complete
            if (i >= k - 1) {
                res[index] = nums[q.peekFirst()];
                index++;
            }
        }
        return res;
    }
}
