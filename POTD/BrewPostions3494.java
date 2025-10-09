package POTD;
import java.util.*;

public class BrewPostions3494 {
    public static void main(String[] args) {
        int[] chef = {1,5,2,4};
        int[] bun ={5,1,4,2};
        System.out.println(mintime(chef,bun));
    }
    public static long mintime(int[] chef,int[] bun){
        int n = chef.length;
        int m = bun.length;
        long[] done = new long[n+1];

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                done[i+1] = Math.max(done[i], done[i+1]) + (long) chef[i] * bun[j];
            }
            for(int i=n-1;i>=0;i--){
                done[i] = done[i+1]- (long) chef[i]*bun[j];
            }
        }

        return done[n];

    }
}
