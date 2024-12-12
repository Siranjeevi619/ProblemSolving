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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp != null){
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while(!stack.isEmpty() && temp != null){
            int currentStack = stack.pop();
            int currentNode = temp.val;
            if(currentStack != currentNode){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}