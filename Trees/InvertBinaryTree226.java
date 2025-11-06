package Trees;
import java.util.*;


public class InvertBinaryTree226 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.nextLine().trim();
        TreeNode root = BuildTree(input);
        Solution1 sol = new Solution1();
        TreeNode inverted = sol.invertTree(root);
        preorder(inverted);
    }

    static TreeNode BuildTree(String input) {
        input = input.replaceAll("\\[|\\]", "");
        if (input.isEmpty()) return null;
        String[] nums = input.split(",");

        List<TreeNode> nodes = new ArrayList<>();
        for (String val : nums) {
            val = val.trim();
            if (val.equals("null")) nodes.add(null);
            else nodes.add(new TreeNode(Integer.parseInt(val)));
        }

        for (int i = 0, j = 1; j < nodes.size(); i++) {
            TreeNode node = nodes.get(i);
            if (node != null) {
                if (j < nodes.size()) node.left = nodes.get(j++);
                if (j < nodes.size()) node.right = nodes.get(j++);
            }
        }
        return nodes.get(0);
    }

    static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }
}

class Solution1 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
