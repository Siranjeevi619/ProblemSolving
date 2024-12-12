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
        // Calculate the total length of the list
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Calculate the position to remove (0-based index)
        int positionToRemove = count - n;

        // Special case: remove the head of the list
        if (positionToRemove == 0) {
            return head.next;
        }

        // Traverse the list to find the node before the one to remove
        temp = head;
        for (int i = 0; i < positionToRemove - 1; i++) {
            temp = temp.next;
        }

        // Remove the nth node from the end by skipping it
        temp.next = temp.next.next;

        return head;
    }
}
