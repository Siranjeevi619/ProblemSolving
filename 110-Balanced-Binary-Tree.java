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
    public boolean isBalanced(TreeNode root) {
        // if(root == null){
        //     return true;
        // }
        // if(root.left == null && root.right == null){
        //     return true;
        // }
        // boolean left = isBalanced(root.left);
        // boolean right = isBalanced(root.right);
        // return left != right;

        return dfs(root) != -1;
    }
    static int dfs(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftHeight = dfs(root.left);
        if(leftHeight == -1){
            return -1;
        }
        int rightHeight = dfs(root.right);
        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return Math.max(leftHeight , rightHeight) + 1;
    }
}