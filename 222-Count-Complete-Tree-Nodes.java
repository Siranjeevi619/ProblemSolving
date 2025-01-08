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
    static int findNode(TreeNode node){
        if(node == null){
            return 0;
        }
        int left = findNode(node.left);
        int right = findNode(node.right);
        return left+right +1;
    }
    public int countNodes(TreeNode root) {
        return findNode(root);        
    }
}