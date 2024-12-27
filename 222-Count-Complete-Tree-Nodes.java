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
    public int countNodes(TreeNode root) {
        Queue <TreeNode> queue = new LinkedList<>();
        int count = 0;
        queue.offer(root);
        if(root== null){
            return count;
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size ; i+=1){
                TreeNode currentNode = queue.poll();
                count +=1;
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
        }
        return count;
    }
}