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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode Attention = dummy;
        ListNode Behind = dummy;
        for (int i = 0; i <= n; i += 1) {
            Attention = Attention.next;
        }
        while (Attention != null) {
            Attention = Attention.next;
            Behind = Behind.next;
        }
        Behind.next = Behind.next.next;
        return dummy.next;

    }
}