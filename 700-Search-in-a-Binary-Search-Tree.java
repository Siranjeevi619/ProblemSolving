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
    public static TreeNode searchBST(TreeNode root, int val) {
        TreeNode newNode = null;
        if(root == null){
            return root;
        }
        else {
            if(root.val == val){
                return root;
            }
            if(val > root.val){
               newNode =  searchBST(root.right, val);
            }
            else{
               newNode =  searchBST(root.left , val);
            }
        }
        return newNode;
    }
}