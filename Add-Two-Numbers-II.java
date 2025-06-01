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
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode newNode = head.next;
            head.next = prev;
            prev = head;
            head = newNode;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode result = new ListNode(-1);
        ListNode dumResult = result;
        int carrySum = 0;
        while(l1 != null || l2 != null || carrySum != 0){
            int currentSum = 0;
            if(l1 != null){
                currentSum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                currentSum += l2.val;
                l2 = l2.next;
            }
            int totalSum = currentSum + carrySum;
            int digit  = totalSum % 10;
            carrySum = totalSum / 10;

            ListNode newNode = new ListNode(digit);
            dumResult.next = newNode;
            dumResult = dumResult.next; 

        }
        return reverse(result.next);
    }
}