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
    static int maximum ;
    public int maxPathSum(TreeNode root) {
        maximum = Integer.MIN_VALUE;
         findMaximum(root);
        return maximum;
    }
    static int findMaximum(TreeNode node ){
        if(node == null){
            return 0;
        }
        int leftHeight =Math.max(0 ,  findMaximum(node.left)) ;
        int rightHeight =Math.max(0 ,  findMaximum(node.right)) ;

        maximum = Math.max(maximum, node.val + leftHeight + rightHeight );

        return node.val + Math.max(leftHeight, rightHeight);
    }

    
}