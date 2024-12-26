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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode > queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        int levelOrder = 0;
        queue.offer(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0 ; i < size  ; i+=1){
                TreeNode currentNode = queue.poll();
                if(levelOrder % 2 == 0){
                        level.add(currentNode.val);
                }
                else{
                        level.add(0, currentNode.val);
                }
               
                if(currentNode.left != null){
                    queue.add(currentNode.left);
                }
                 if(currentNode.right != null){
                    queue.add(currentNode.right);
                }
                
            }
            result.add(level);
            levelOrder+=1;
        }
        return result;

    }
}