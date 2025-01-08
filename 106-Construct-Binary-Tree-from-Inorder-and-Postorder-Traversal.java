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
    static TreeNode constructTree(int [] inorder, int inOrderStart , int inOrderEnd, int [] postorder, int postOrderStart, int postOrderEnd, Map<Integer, Integer> mpp){
        if(inOrderStart > inOrderEnd  || postOrderStart > postOrderEnd){
            return null;
        }
        TreeNode newNode = new TreeNode(postorder[postOrderEnd]);
        int  currentInOrder = mpp.get(newNode.val);
        int nodesleft = currentInOrder - inOrderStart;


        newNode.left = constructTree(inorder, inOrderStart   ,  currentInOrder - 1 ,postorder,postOrderStart  ,postOrderStart + nodesleft - 1  , mpp );
        newNode.right = constructTree(inorder,  currentInOrder + 1   , inOrderEnd  ,postorder, postOrderStart + nodesleft , postOrderEnd - 1 , mpp );
        return newNode;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int inorderSize = inorder.length;
        int postorderSize = postorder.length;
        Map<Integer, Integer> mpp = new HashMap<>();
        for(int i  = 0; i < inorderSize ; i +=1){
            mpp.put(inorder[i],i);
        }
        TreeNode result = constructTree(inorder, 0, inorderSize -1 , postorder, 0, postorderSize - 1, mpp);
        return result;
    }
}