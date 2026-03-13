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
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return null;
        }
        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy;
        while(temp != null ){
            while(temp.next != null && temp.next.val == val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}