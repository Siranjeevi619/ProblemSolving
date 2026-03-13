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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-110000, head);
        ListNode temp = dummy;
        while(temp != null){
            while(temp.next != null && temp.val == temp.next.val){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}