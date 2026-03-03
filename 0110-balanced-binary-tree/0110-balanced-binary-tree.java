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
    
        return height(root) != -1;
    }

    static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
    
        
        int leftTree = height(root.left);
        if (leftTree == -1) {
            return -1;
        }
     
        int rightTree = height(root.right);
           if (rightTree == -1) {
            return -1;
        }
        if (Math.abs(leftTree - rightTree) > 1) {
            return -1;
        }
        return 1 + Math.max(leftTree, rightTree);
    }
}