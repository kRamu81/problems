package Recursion.Backtracking;
import java.util.*;

public class Lc784_LetterCasePermutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st = sc.next();

        Lc784_LetterCasePermutation obj = new Lc784_LetterCasePermutation();
        List<String> result = obj.ans(st);

        System.out.println(result);
    }

    private List<String> ans(String s) {
        List<String> res = new ArrayList<>();
        char[] arr = s.toCharArray();
        backtrack(res, 0, arr);
        return res;
    }

    private void backtrack(List<String> res, int i, char[] arr) {

        if (i == arr.length) {
            res.add(new String(arr));
            return;
        }

        if (Character.isLetter(arr[i])) {

            // first choice: lowercase
            arr[i] = Character.toLowerCase(arr[i]);
            backtrack(res, i + 1, arr);

            // second choice: uppercase
            arr[i] = Character.toUpperCase(arr[i]);
            backtrack(res, i + 1, arr);

        } else {
            backtrack(res, i + 1, arr);
        }
    }
}
