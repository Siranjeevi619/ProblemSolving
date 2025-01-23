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
    public ListNode partition(ListNode head, int x) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        while(head != null){
            if(head.val < x){
                temp1.next = new ListNode(head.val);
                temp1 = temp1.next;
            }
            else{
                temp2.next = new ListNode(head.val);
                temp2 = temp2.next;
            }
            head = head.next;
        }
        temp2.next = null;
        temp1.next = l2.next;
        return l1.next;
    }
}