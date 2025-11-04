package Trees;
import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    public void inorderTraversal(TreeNode root) {
        inorder(root);
    }

    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }
}

public class Traversal {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.nextLine().trim();  // e.g., [1,null,2,3]
        TreeNode root = buildTree(input);

        Solution sol = new Solution();
        sol.inorderTraversal(root);
    }

    // Build tree from LeetCode-like input [1,null,2,3]
    static TreeNode buildTree(String input) {
        input = input.replaceAll("\\[|\\]|\\s", "");
        if (input.isEmpty()) return null;

        String[] arr = input.split(",");
        if (arr[0].equals("null")) return null;

        List<TreeNode> nodes = new ArrayList<>();
        for (String val : arr) {
            if (val.equals("null")) nodes.add(null);
            else nodes.add(new TreeNode(Integer.parseInt(val)));
        }

        for (int i = 0, j = 1; j < nodes.size(); i++) {
            TreeNode curr = nodes.get(i);
            if (curr != null) {
                if (j < nodes.size()) curr.left = nodes.get(j++);
                if (j < nodes.size()) curr.right = nodes.get(j++);
            }
        }

        return nodes.get(0);
    }
}
