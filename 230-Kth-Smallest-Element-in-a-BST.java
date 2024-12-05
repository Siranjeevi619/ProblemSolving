// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     static List<Integer> inorderOperation(TreeNode root){
//         List<Integer> ls = new ArrayList<>();
//         if(root == null){
//             return ls;
//         }        
//         ls.addAll(inorderOperation(root.left));
//         ls.add(root.val);
//         ls.addAll(inorderOperation(root.right));
//         return ls;
//     }
//     static int sortAndReturnK(List<Integer> list, int k){
//                 Collections.sort(list);
//                 int size = list.size() -1;
//                 return list.indexOf(size-k);
//     }
//     public int kthSmallest(TreeNode root, int k) {
//         List<Integer> TreeList = inorderOperation(root);
//         int ans = sortAndReturnK(TreeList, k);
//         return ans;
        
//     }
// }

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    static List<Integer> inorderOperation(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        if (root == null) {
            return ls;
        }
        ls.addAll(inorderOperation(root.left));
        ls.add(root.val);
        ls.addAll(inorderOperation(root.right));
        return ls;
    }

    static int sortAndReturnK(List<Integer> list, int k) {
        Collections.sort(list);
        return list.get(k - 1);
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> TreeList = inorderOperation(root);
        return sortAndReturnK(TreeList, k);
    }
}
