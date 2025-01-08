/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    static TreeNode constructTree(int[] preorder, int preOrderStart, int preOrderEnd, int[] inorder, int inOrderStart,
            int inOrderEnd, Map<Integer, Integer> mpp) {
        if (preOrderStart > preOrderEnd || inOrderStart > inOrderEnd) {
            return null;
        }
        TreeNode newNode = new TreeNode(preorder[preOrderStart]);
        int currentInOrder = mpp.get(newNode.val);
        int nodesLeft = currentInOrder - inOrderStart;

        newNode.left = constructTree(preorder, preOrderStart + 1, preOrderStart + nodesLeft, inorder, inOrderStart,
                currentInOrder - 1, mpp);
        newNode.right = constructTree(preorder, preOrderStart + nodesLeft + 1, preOrderEnd, inorder, currentInOrder + 1,
                inOrderEnd , mpp);

        return newNode;

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int inorderSize = inorder.length;
        int preorderSize = preorder.length;
        for (int i = 0; i < inorderSize; i += 1) {
            mpp.put(inorder[i], i );
        }
        TreeNode result = constructTree(preorder, 0, preorderSize - 1, inorder, 0, inorderSize - 1, mpp);
        return result;
    }
}