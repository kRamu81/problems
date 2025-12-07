package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subset {
    public static List<List<Integer>> getAllSubsets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();

        subsetRecur(0, arr, res, subset);

        // Sort each subset
        for (List<Integer> sub : res) {
            Collections.sort(sub);
        }

        // Sort by size first, then lexicographically
        res.sort((a, b) -> {
            int minLen = Math.min(a.size(), b.size());
            for (int i = 0; i < minLen; i++) {
                if (!a.get(i).equals(b.get(i))) {
                    return a.get(i) - b.get(i);
                }
            }
            return a.size() - b.size();
        });


        return res;
    }

    static void subsetRecur(int i, int[] arr, List<List<Integer>> res, List<Integer> subset) {
        if (i == arr.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        // include current
        subset.add(arr[i]);
        subsetRecur(i + 1, arr, res, subset);

        // exclude current
        subset.remove(subset.size() - 1);
        subsetRecur(i + 1, arr, res, subset);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> result = getAllSubsets(arr);

        for (List<Integer> list : result) {
            for (int x : list) System.out.print(x + " ");
            System.out.println();
        }
    }
}
