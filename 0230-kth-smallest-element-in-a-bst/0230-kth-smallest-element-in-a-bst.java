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
   
    static void inorder(ArrayList<Integer> ls , TreeNode root){
        if(root != null){
          inorder(ls, root.left);
        ls.add(root.val);
        inorder(ls, root.right);
        }
        
    }
    public int kthSmallest(TreeNode root, int k) {
         ArrayList<Integer> ls = new ArrayList<>();
        inorder( ls, root);
        return ls.get(k - 1);
    }
}