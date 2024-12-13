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
    public ListNode sortList(ListNode head) {
        int count = 0;
        ListNode temp = head;
        List <Integer> nodeList = new ArrayList<>();
        while(temp != null){
            nodeList.add(temp.val);
            temp = temp.next;
        }

        Collections.sort(nodeList);

        temp = head;
        int i = 0;
        while(temp != null){
            temp.val = nodeList.get(i);
            i +=1 ;
            temp = temp.next;
        }
        return head;
    }
}