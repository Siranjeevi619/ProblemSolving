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
    public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return findSum(root, set, k);
        
    }
    static boolean findSum(TreeNode node, Set<Integer> set , int target){
        if(node == null){
            return false ;
        }
        if(set.contains(target - node.val)) return true;
        set.add(node.val);
        return findSum(node.left , set, target) || findSum(node.right , set, target);
    }
}