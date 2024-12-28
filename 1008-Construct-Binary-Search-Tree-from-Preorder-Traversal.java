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
    static TreeNode buildTree(TreeNode node, int key ){
        if(node == null){
            return new TreeNode(key);
        }
        else if(key < node.val){
            node.left = buildTree(node.left, key);
        }
        else{
            node.right = buildTree(node.right, key);
        }
        return node;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        for(int i : preorder){
            root = buildTree(root, i);
        }
        return root;
    }
}