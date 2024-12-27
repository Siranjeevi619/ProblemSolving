//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    public Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {
    static Node buildTree(String str) {
        // Corner Case
        if (str.length() == 0 || str.equals('N')) return null;
        String[] s = str.split(" ");

        Node root = new Node(Integer.parseInt(s[0]));
        Queue<Node> q = new LinkedList<Node>();
        q.add(root);

        // Starting from the second element
        int i = 1;
        while (!q.isEmpty() && i < s.length) {
            // Get and remove the front of the queue
            Node currNode = q.remove();

            // Get the current node's value from the string
            String currVal = s[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= s.length) break;
            currVal = s[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                q.add(currNode.right);
            }

            i++;
        }

        return root;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution T = new Solution();

            ArrayList<Integer> res = T.boundaryTraversal(root);
            for (Integer num : res) System.out.print(num + " ");
            System.out.println();
            t--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

// class Node
// {
//     int data;
//     Node left, right;
//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }

class Solution {
    static boolean isLeaf(Node node){
        if(node.left != null || node.right != null){
            return false;
        }
        return true;
    }
    static void findLeftNode(ArrayList<Integer> result, Node node){
        Node temp = node.left;
        while(temp != null){
            if(isLeaf(temp) == false){
                result.add(temp.data);
                //  return ;
            }
            if(temp.left != null){
                temp = temp.left;
            }
            else{
                temp = temp.right;
            }
        }
    }
    
    static void findReverseRightNode(List<Integer> result, Node node ){
        Node temp = node.right;
        ArrayList<Integer> dummy = new ArrayList<>();
        while(temp != null){
            if(isLeaf(temp) == false){
                dummy.add(temp.data);
                // return ;
            }
            if(temp.right != null){
                temp = temp.right;
            }
            else{
                temp = temp.left;
            }
        }
        // int i = 0;
        for(int i = dummy.size() - 1 ; i >=0 ; i-- ){
            result.add(dummy.get(i));
        }
    }
    
    static void findLeaves(List <Integer> result, Node node ){
     if(isLeaf(node)){
         result.add(node.data);
         return ;
     }   
     if(node.left != null) {
         findLeaves(result , node.left );
     }
     if(node.right != null){
                  findLeaves(result ,node.right);

     }
    }
    
    
    
    ArrayList<Integer> boundaryTraversal(Node node) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        if(isLeaf(node) == false) {
            result.add(node.data);
        }
        findLeftNode(result, node);
        findLeaves(result, node);
        findReverseRightNode(result, node);
        return result;
    }
}
