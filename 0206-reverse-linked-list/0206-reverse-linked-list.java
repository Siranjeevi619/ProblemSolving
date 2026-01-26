/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        ListNode next = null;
        while(temp != null){
            ListNode newNode  = temp.next;
            temp.next = next;
            next = temp;
            temp = newNode;
        }
        return next;
    }
}