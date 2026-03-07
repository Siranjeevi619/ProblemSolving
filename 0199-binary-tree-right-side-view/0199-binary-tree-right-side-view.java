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
    public List<Integer> rightSideView(TreeNode root) {
         if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int queueSize = q.size();
            for (int i = 0; i < queueSize; i += 1) {
                TreeNode queue = q.poll();
                if(queue.left != null){
                    q.offer(queue.left);
                }
                if(queue.right != null){
                     q.offer(queue.right);
                }
                if(i == queueSize -1 ){
                    res.add(queue.val);
                   
                }
                
            }
        }
        return res;
    }
}