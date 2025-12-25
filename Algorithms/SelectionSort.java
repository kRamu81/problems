package Algorithms;
import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        // Selection Sort
        for (int i = 0; i < n; i++) {
            int min = a[i];
            int idx = i;

            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    idx = j;
                }
            }

            int temp = a[i];
            a[i] = a[idx];
            a[idx] = temp;
        }

        // Print sorted array
        for (int val : a) {
            System.out.print(val + " ");
        }

        s.close();
    }
}


/*

Correct Explanation (Your Idea → Fixed)
Fix one position → compare with all remaining elements → select the correct one → swap → move to next position → repeat

🧠 Step-by-Step Logic (Very Clear)
--->Fix the first position
--->Compare it with all remaining elements
--->Find the minimum element
--->Place it at the fixed position (one swap)
--->Move to the next position
--->Repeat until array is sorted
 */