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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if(root == null){
            return result;
        }

        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            List <Integer> levelOrder =  new LinkedList<>();
            for(int i = 0; i < size ; i++){
                // TreeNode currentNode = q.peek();
                // if(currentNode.left != null){
                //     q.offer(currentNode.left);
                // }
                // if(currentNode.right != null){
                //     q.offer(currentNode.right);
                // }
                // TreeNode temp = q.poll();
                // levelOrder.add(temp.val);


                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }

                levelOrder.add(queue.poll().val);


            }

            result.add(0,levelOrder);
        }
        return result;
    }
}