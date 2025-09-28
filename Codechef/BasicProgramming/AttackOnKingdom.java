package Codechef.BasicProgramming;
import java.util.Scanner;

public class AttackOnKingdom {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while(t-- > 0){
            int n = s.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = s.nextInt();
            }

            int min = Integer.MAX_VALUE;
            int smin = Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                if(a[i] < min){
                    smin = min;
                    min = a[i];
                } else if(a[i] < smin && a[i] != min){
                    smin = a[i];
                }
            }
            
            System.out.println(smin);
        }
    }
}
