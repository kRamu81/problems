package Trees;
import java.util.*;

public class ZigzagTraversal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine().trim();
        TreeNode root = BuiltTree.construct(input);

        Solution103 sol = new Solution103();
        sol.Zigzag(root);
    }
}
class Solution103{
    public void Zigzag(TreeNode root){
        if (root == null) return;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean rotate = true;
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                level.add(node.val);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
            if (!rotate) Collections.reverse(level);
            for(int val : level){
                System.out.print(val+" ");
            }
            rotate = !rotate;
        }
        System.out.println();
    }
}
