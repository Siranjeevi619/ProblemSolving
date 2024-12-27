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
    static boolean findBST(TreeNode root, long min, long max){
         if(root == null ){
            return true;
        }
        if(root.val <= min || root.val >= max){
            return false;
        }
        return findBST(root.left , min , root.val) && findBST(root.right , root.val, max);
        
    }
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return false;
        }
       
        // if(root.left == null && root.right == null){
        //     return true;
        // }
        // if(root.val <= root.left.val){
        //     return false;
        // }
        // if(root.val >= root.right.val){
        //     return false;
        // }
        return findBST(root, Long.MIN_VALUE,Long.MAX_VALUE);
        // return true && (isValidBST(root.left) && isValidBST(root.right));
    }
}