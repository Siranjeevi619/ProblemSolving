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
    public List<Integer> preorderTraversal(TreeNode root) {
        // List <Integer> ls = new ArrayList<>();
        // if(root == null){
        //     return ls;
        // }

        // ls.add(root.val);
        // ls.addAll(preorderTraversal(root.left));
        // ls.addAll(preorderTraversal(root.right));
        // return ls;


          List<Integer> result = new ArrayList<>();
        Stack <TreeNode> stack = new Stack<>();

        if(root == null){
            return result;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode currentNode = stack.pop();
            result.add(currentNode.val);
            if(currentNode.right != null){
                stack.push(currentNode.right);
            } 
            if(currentNode.left != null){
                stack.push(currentNode.left);
            }
        }
        return result;


    }
}