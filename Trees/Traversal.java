package Trees;
import java.util.*;


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

//preorder
class Preorder{
    public void preorderTraversal(TreeNode root){
        preorder(root);
    }
    private void preorder(TreeNode node){
        if(node == null) return;
        System.out.print(node.val+" ");
        preorder(node.left);
        preorder(node.right);
    }
}

public class Traversal {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.nextLine().trim();  // e.g., [1,null,2,3]
        TreeNode root = buildTree(input);

        Solution sol = new Solution();
        sol.inorderTraversal(root);

        //preorder
        System.out.println("\n");
        Preorder pre = new Preorder();
        pre.preorderTraversal(root);
    }

    // Build tree from LeetCode-like input [1,null,2,3]
    static TreeNode buildTree(String input) {
        input = input.replaceAll("\\[|]|\\s", "");
        if (input.isEmpty()) return null;

        String[] arr = input.split(",");
        List<TreeNode> nodes = new ArrayList<>();

        for (String val : arr) {
            val = val.trim();
            if (val.equals("null")) nodes.add(null);
            else nodes.add(new TreeNode(Integer.parseInt(val)));
        }

        if(nodes.isEmpty()) return null;

        for (int i = 0, j = 1; j < nodes.size(); i++) {
            TreeNode curr = nodes.get(i);
            if (curr != null) {
                curr.left = nodes.get(j++);
                if (j < nodes.size()) curr.right = nodes.get(j++);
            }
        }

        return nodes.getFirst();
    }
}
