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
    static int diameter;
    static int findDiameter(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftDepth = findDiameter(root.left);
        int rightDepth = findDiameter(root.right);

        diameter = Math.max(diameter, leftDepth + rightDepth);
        return 1 + Math.max(leftDepth, rightDepth);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
         findDiameter(root);
        return diameter;
    }
}