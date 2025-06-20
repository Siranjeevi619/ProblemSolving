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
    static ArrayList<Integer> check(TreeNode root){
        ArrayList<Integer> ls = new ArrayList<>();
        if(root == null){
            return ls;
        }
        ls.addAll(check(root.left));
        ls.add(root.val);
        ls.addAll(check(root.right));
        return ls;
        
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        ArrayList<Integer> val = check(root);
        Collections.sort(val);
        int sum = 0;
        for(int i : val){
            if(low<=i && high >= i){
                sum+=i;
            }
        }
        return sum;
    }
}