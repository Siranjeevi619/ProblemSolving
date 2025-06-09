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
    public ListNode oddEvenList(ListNode head) {
        int index = 1;
        ListNode temp = head;
        ListNode nodeTrackOdd = new ListNode(-1);
        ListNode nodeTrackEven = new ListNode(-1);
         ListNode dumEven = nodeTrackEven;
        ListNode dumOdd = nodeTrackOdd;
        while (temp != null ) {
             if (index % 2 == 1) {
                nodeTrackOdd.next = new ListNode(temp.val);
                nodeTrackOdd = nodeTrackOdd.next;
            } else {
                nodeTrackEven.next = new ListNode(temp.val);
                nodeTrackEven = nodeTrackEven.next;
            }
            temp = temp.next;
            index++;
        }
       
       nodeTrackOdd.next = dumEven.next;
       return dumOdd.next;
    }
}