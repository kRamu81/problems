package Trees;
import java.util.*;

public class BinaryTreeRightsideView199 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();

        TreeNode root = BuildTree.construct(input);

        Solution199 sol = new Solution199();
        List<Integer> ans = sol.rightView(root);

        for(int x : ans){
            System.out.print(x + " ");
        }
    }
}

class Solution199 {
    public List<Integer> rightView(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            TreeNode curr = null;

            for(int i = 0; i < size; i++){
                curr = q.poll();
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            result.add(curr.val);
        }
        return result;
    }
}
