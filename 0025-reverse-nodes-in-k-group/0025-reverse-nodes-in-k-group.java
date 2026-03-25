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
    public ListNode reverseKGroup(ListNode head, int k) {
       
         
        if(head == null ){
            return head;
        }
        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count += 1;
            temp = temp.next;
        }
       
        ListNode end = head;;
        for(int i = 0 ; i < k ; i++){
            if(end == null){
                return head;
            }
            end = end.next;
        }

        ListNode newNode = reverse(head, end);
        head.next =  reverseKGroup(end, k);
        return newNode;
    }
    static ListNode reverse(ListNode head , ListNode end){
        ListNode prev = null ;
        while(head != end){
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}