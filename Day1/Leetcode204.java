import java.util.*;

public class Leetcode204 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(countPrimes(n));
    }

    // public static int countPrimes(int n) {
    //     int count = 0;
    //     for (int i = 2; i < n; i++) {   
    //         if (isPrime(i)) {
    //             count++;
    //         }
    //     }
    //     return count;
    // }

    // public static boolean isPrime(int num) {
    //     if (num < 2) return false;
    //     for (int i = 2; i * i <= num; i++) {  // checking from sqrt 
    //         if (num % i == 0) return false;
    //     }
    //     return true;
    // }

    
    public static int countPrimes(int n) {
        if(n<=2) return 010;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime,true);
        //[true,true,true,true,true,true,true,true,true,true]
        prime[0] = false;
        prime[1] = false;
        for(int i=2;i*i<n;i++){
            if(prime[i]){
                for(int j=i*i;j<n;j+=i){//4,10,2 ->6,10,3  ->step replace false
                    prime[j] = false;
                }
            }
        }

        int count=0;
        for(int i=0;i<n;i++){
            if(prime[i]){
                count++;
            }
        }
        return count;

    }
}
