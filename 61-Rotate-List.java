/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static void rotateNodes(ListNode rotate) {
      
    }

    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        if (head == null || head.next == null)
            return head;

        // ListNode passNode = head;
        // while (k != 0) {
        //     rotateNodes(head);
        //     k -= 1;
        // }

        // for(int i = 0 ;i<k ; i++){
        // ListNode headNode = passNode;
        // while(headNode.next.next != null){
        // headNode = headNode.next;
        // }
        // ListNode endNode = headNode.next;
        // headNode.next = null;
        // endNode.next = head;
        // endNode = head;
        // }
        ListNode findCount = head;
        while(findCount != null){
            count += 1;
            findCount = findCount.next;
        }
        // findCount = head;

        k = k % count;
        for(int i =0;i<k ;i++){
              ListNode temp = head;
            while (temp.next.next != null) {
            temp = temp.next;
            }
            ListNode endNode = temp.next;
        temp.next = null;
        endNode.next = head;
        // endNode = head;
        head = endNode;
        }

        return head;
    }
}