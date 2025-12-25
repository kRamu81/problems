package Algorithms;
import java.util.*;

public class ComparatorFunction {
    // Complete the cmp func to solve the problem
    public static boolean cmp(int[] a, int[] b) {
        int da = a[0] * a[0] + a[1] * a[1];
        int db = b[0] * b[0] + b[1] * b[1];

        if (da != db) {
            return da > db;
        }
        return a[0] > b[0];

    }

    public static void sort(int[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(cmp(arr[j], arr[j + 1])) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        sort(arr);

        for(int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
