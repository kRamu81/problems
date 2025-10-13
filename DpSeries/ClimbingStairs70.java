package DpSeries;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    public static int climbStairs(int n) {
        if(n==0) return 1;
        if(n==1) return 1;

        int prev2 = 1;
        int prev1 = 1;
        for(int i=2;i<=n;i++){
            int current = prev1+prev2;
            prev2= prev1;
            prev1 = current;
        }
        return prev1;
    }
}
