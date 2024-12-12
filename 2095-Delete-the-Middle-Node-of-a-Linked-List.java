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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null ){
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }

        int mid = count / 2;
        temp = head;
        int currentPosition = 0;
        while(temp != null){
            if(currentPosition == mid - 1){
                temp.next = temp.next.next;
            }
            currentPosition += 1;
            temp = temp.next;
        }
        return head;
    }
}