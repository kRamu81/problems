package Recursion;

import java.util.*;

class UniqueSubset90{

    public static List<List<Integer>> uniqueSubsets(int[] multiset) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(multiset);
        backtrack(0, multiset, new ArrayList<>(), res);
        return res;
    }

    private static void backtrack(int index, int[] nums, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) continue;

            current.add(nums[i]);
            backtrack(i + 1, nums, current, result);
            current.removeLast();
        }
    }

    public static void printSubsets(List<List<Integer>> subsets) {
        for (List<Integer> subset : subsets) {
            System.out.print("[");
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i));
                if (i < subset.size() - 1) System.out.print(" ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] multiset = new int[n];

        for (int i = 0; i < n; i++) {
            multiset[i] = scanner.nextInt();
        }

        List<List<Integer>> result = uniqueSubsets(multiset);
        printSubsets(result);
    }
}
