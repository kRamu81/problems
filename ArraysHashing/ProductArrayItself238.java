package Day4;
import java.util.*;

public class ProductArrayItself238 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = s.nextLine().trim().split("\\s+");
        int[] nums = new int[input.length];
        for(int i=0;i<input.length;i++){
            nums[i] = Integer.parseInt(input[i]);
        }
        int[] ans = product(nums);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] product(int[] nums){
        int n = nums.length;
        int[] res = new int[n];
        int prodl = 1;  // left product
        int prodr = 1;  // right product

        // store right product
        for(int i=n-1;i>=0;i--){
            res[i] = prodr;
            prodr *= nums[i];
        }

        // multiply with left product
        for(int i=0;i<n;i++){
            res[i] *= prodl;
            prodl *= nums[i];
        }

        return res;
    }
}
