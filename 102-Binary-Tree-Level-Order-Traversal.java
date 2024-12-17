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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // List<Integer> nodes  = new ArrayList<>();
        // List<List<Integer>> result = new ArrayList<>();
        // List<Integer> ans = new ArrayList<>();

        // ans.add(root);

        // // int rootSize = 0;

        // // Queue<TreeNode> currentHold  = new ArrayList<>();
        // // // while(root.left != null || root.right != null){
        // // //     rootSize += 1;
        // // // 

        // // currentHold.offer(root);


        // // while(!currentHold.isEmpty()){
        // //     int nLevel = currentHold.size();
        // //     List<Integer> subList = new ArrayList<Integer>();
        // // }

        // // for(int i = 0 ;i<rootSize ; i++){

        // // }

        // result.add(ans);
        // return result;



        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null){
            return result;
        }

        q.offer(root);

        while(q.size() > 0){
            int size = q.size();
            List <Integer> levelOrder =  new ArrayList<>();
            for(int i = 0; i < size ; i++){
                TreeNode currentNode = q.poll();
                levelOrder.add(currentNode.val);
                if(currentNode.left != null){
                    q.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    q.offer(currentNode.right);
                }


            }
            result.add(levelOrder);
        }
        return result;

    }
}