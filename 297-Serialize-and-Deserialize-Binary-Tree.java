/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        StringBuilder serialString = new StringBuilder();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                serialString.append("n ");
                continue;
            }
            serialString.append(node.val + " ");
            queue.offer(node.left);
            queue.offer(node.right);
        }
        System.out.println(serialString.toString());
        return serialString.toString();
    }

    public TreeNode deserialize(String data) {
        if (data == "") {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        String[] nodes = data.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(nodes[0]));
        queue.offer(root);
        for (int i = 1; i < nodes.length; i += 1) {
            TreeNode newNode = queue.poll();
            if (!nodes[i].equals("n")) {
                TreeNode leftNode = new TreeNode(Integer.parseInt(nodes[i]));
                newNode.left = leftNode;
                queue.add(leftNode);
            }
            if (!nodes[++i].equals("n")) {
                TreeNode rightNode = new TreeNode(Integer.parseInt(nodes[i]));
                newNode.right = rightNode;
                queue.add(rightNode);
            }
        }
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));