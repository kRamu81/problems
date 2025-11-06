package Trees;
import java.util.*;



class Solution4{
    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        int right = maxDepth(root.right);
        int left = maxDepth(root.left);
        return 1 + Math.max(left, right);
    }
}
class Solution5{
    public int minDepth(TreeNode root){
        if(root == null) return 0;
        if(root.left == null) return minDepth(root.right)+1;
        if(root.right == null) return minDepth((root.left))+1;
        return Math.min(minDepth(root.left),minDepth(root.right));
    }
}

public class maxDepth104 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.nextLine().trim();
        TreeNode root = BuildTree(input);
        Solution4 sol = new Solution4();
        int res = sol.maxDepth(root);
        System.out.println(res);

        //leetcode 111
        Solution5 sol1 = new Solution5();
        int res1 = sol1.minDepth(root);
        System.out.println(res1);
    }

    static TreeNode BuildTree(String input){
        input = input.replaceAll("\\[|\\]", "");
        if(input.isEmpty()) return null;

        String[] parts = input.split(",");
        List<TreeNode> nodes = new ArrayList<>();

        for(String val : parts){
            val = val.trim();
            if(val.equals("null")) nodes.add(null);
            else nodes.add(new TreeNode(Integer.parseInt(val)));
        }

        for(int i = 0, j = 1; j < nodes.size(); i++){
            TreeNode curr = nodes.get(i);
            if(curr != null){
                if(j < nodes.size()) curr.left = nodes.get(j++);
                if(j < nodes.size()) curr.right = nodes.get(j++);
            }
        }
        return nodes.get(0);
    }
}
