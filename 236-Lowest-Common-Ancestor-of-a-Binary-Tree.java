/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static TreeNode findAncestor(TreeNode node ,TreeNode p , TreeNode q){
        if(node == null || node == p || node == q){
            return node;
        }
        TreeNode left  = findAncestor(node.left, p, q);
        TreeNode right = findAncestor(node.right, p ,q);
        if(left == null ){
            return right;
        }
        else if(right == null){
            return left;
        }
        else{
            return node;
        }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return findAncestor(root, p, q);
    }
}