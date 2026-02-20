package POTD.GFG.Feb2026;
import java.util.*;

public class LargestNumber179 {
    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};

        // Convert to String array
        String[] a = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            a[i] = Integer.toString(arr[i]); // using String.valueOf taking maximum time
        }

        // Sort using custom comparator: (b+a) vs (a+b)
        Arrays.sort(a, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // handle 0
        if (a[0].equals("0")) {
            System.out.println("0");
            return;
        }

        //result
        StringBuilder sb = new StringBuilder();
        for (String s : a) {
            sb.append(s);
        }
        System.out.println(sb.toString());
    }
}
