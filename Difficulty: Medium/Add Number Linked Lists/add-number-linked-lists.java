//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    static Node reverse(Node node){
        Node prev = null;
        while(node != null){
            Node next = node.next;
            node.next = prev;
            prev = node;
            node = next;
            
        }
        return prev;
    }
    static Node addTwoLists(Node num1, Node num2) {
        // code here
        Node n1 = reverse(num1);
        Node n2 = reverse(num2);
        //   return n2;
        Node dummyNode = new Node(-1);
        Node current = dummyNode;
        int sum = 0;
        while(n1 != null || n2 != null || sum != 0 ){
            if(n1 != null){
                sum += n1.data;
                n1 = n1.next;
            }
            if(n2 != null){
                sum += n2.data;
                n2 = n2.next;
            }
            current.next = new Node(sum% 10);
            sum /=10;
            current = current.next;
        }
        Node result = reverse(dummyNode.next);
        if(result.data == 0){
            return result.next;
        }
        
        return result;
      
        
    }
}

//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends