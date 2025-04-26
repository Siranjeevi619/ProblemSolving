
class Solution {
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Long> res = new ArrayList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int n = queue.size();
            long sum = 0;
            for (int i = 0; i < n; i += 1) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
               
            }
             res.add(sum);
        }
        if(k > res.size()){
            return -1;
        }
        res.sort(Collections.reverseOrder());
        return res.get(k-1);
    }
}