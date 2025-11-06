package Trees;
import java.util.*;



// 2. Input read and tree build
public class inoreder1 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.nextLine().trim();
        TreeNode root = buildTree(input);
        Solution2 sol = new Solution2();
        List<Integer> result = sol.inorderTraversal(root);
//        System.out.println(result); for list
        // for the space separated
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) System.out.print(" ");
        }
    }

    // 3. Build tree from level order input
    static TreeNode buildTree(String input) {
        input = input.replaceAll("\\[|\\]", "");
        if (input.isEmpty()) return null;
        String[] arr = input.split(",");

        List<TreeNode> nodes = new ArrayList<>();
        for (String val : arr) {
            val = val.trim();// to check the any base
            if (val.equals("null")) nodes.add(null);
            else nodes.add(new TreeNode(Integer.parseInt(val)));
        }
        if (nodes.isEmpty()) return null;

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

// 4. Inorder traversal
class Solution2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private void inorder(TreeNode node, List<Integer> res) {
        if (node == null) return;
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }
}
