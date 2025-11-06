package Trees;
import java.util.*;


public class BuildTree {
    public static void main(String[] args) {
        String input = "1 2 3 4 6 -1 9";
        TreeNode root = construct(input);

        Solution8 sol = new Solution8();
        sol.inorder1(root);
    }

    static TreeNode construct(String input){
        if(input == null || input.length() == 0) return null;

        String[] parts = input.split(" ");
        List<TreeNode> nodes = new ArrayList<>();

        for(String val : parts){
            if(val.equals("-1")) nodes.add(null);
            else nodes.add(new TreeNode(Integer.parseInt(val)));
        }

        for(int i=0, j=1; j<nodes.size(); i++){
            TreeNode curr = nodes.get(i);
            if(curr != null){
                if(j < nodes.size()) curr.left = nodes.get(j++);
                if(j < nodes.size()) curr.right = nodes.get(j++);
            }
        }

        return nodes.get(0);
    }
}

class Solution8 {
    public void inorder1(TreeNode root){
        inorder(root);
        System.out.println();
    }

    private void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
