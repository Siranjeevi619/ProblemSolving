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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }
        ListNode res = new ListNode(0, head);
        ListNode dummy = res;
        for (int i = 1; i < left; i += 1) {
            dummy = dummy.next;
        }
        int diff = right - left;
        ListNode midNode = dummy.next;
        for (int i = 0; i < diff; i += 1) {
            ListNode temp = midNode.next;
            midNode.next = temp.next;
            temp.next = dummy.next;
            dummy.next = temp;
        }
        return res.next;

    }
}