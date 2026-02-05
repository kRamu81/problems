package POTD.Leetcode;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class MaxLevelSumBinaryTree {

    // Function for LC 1161
    public static int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int level = 1;
        int ans = 1;
        int maxSum = Integer.MIN_VALUE;

        while (!q.isEmpty()) {
            int size = q.size();
            int sum = 0;

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                ans = level;
            }
            level++;
        }
        return ans;
    }

    // Build tree from level order input
    public static TreeNode buildTree(Scanner sc) {
        int val = sc.nextInt();
        if (val == -1) return null;

        TreeNode root = new TreeNode(val);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            int leftVal = sc.nextInt();
            if (leftVal != -1) {
                curr.left = new TreeNode(leftVal);
                q.add(curr.left);
            }

            int rightVal = sc.nextInt();
            if (rightVal != -1) {
                curr.right = new TreeNode(rightVal);
                q.add(curr.right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter tree nodes in level order (-1 for null):");
        TreeNode root = buildTree(sc);

        int result = maxLevelSum(root);
        System.out.println("Level with maximum sum: " + result);
    }
}
