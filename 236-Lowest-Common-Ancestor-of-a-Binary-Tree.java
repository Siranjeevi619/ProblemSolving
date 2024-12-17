/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static boolean nodeToRoot(TreeNode node, TreeNode target, List<TreeNode> result){
        if(node == null){
            return false;
        }

        if(node.val == target.val){
            result.add(node);
            return true;
        }

        boolean ls = nodeToRoot(node.left, target, result);
        if(ls){
            result.add(node);
            return true;
        }

        boolean rs = nodeToRoot(node.right, target, result); 
        if(rs){
            result.add(node);
            return true;
        }
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List <TreeNode> pAL = new ArrayList<>();
        List <TreeNode> qAL = new ArrayList<>();

        nodeToRoot(root, p, pAL);
        nodeToRoot(root, q, qAL);
        int pSize = pAL.size() - 1;
        int qSize = qAL.size() - 1;

          while (pSize >= 0 && qSize >= 0 && pAL.get(pSize) == qAL.get(qSize)) {
            pSize--;
            qSize--;
        }

        return pAL.get(pSize + 1 );
    }
}