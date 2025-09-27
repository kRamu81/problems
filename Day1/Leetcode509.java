import java.util.*;
public class Leetcode509 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
    public static int fib(int n){
        if(n<=1) return n;
        int a=0, b=1, c= 0;
        for(int i=2;i<=n;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
}
