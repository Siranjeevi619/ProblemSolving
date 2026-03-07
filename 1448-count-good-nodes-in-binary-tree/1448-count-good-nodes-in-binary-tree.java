/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {


    static int dfs(TreeNode root, int maxValue) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        if (root.val >= maxValue) {
            count = 1;
        }
        maxValue = Math.max(root.val, maxValue);
        count +=dfs(root.left, maxValue);
        count += dfs( root.right, maxValue);
        return count;
    }

    public int goodNodes(TreeNode root) {
        return dfs(root, (int) -1e9);
    }
}