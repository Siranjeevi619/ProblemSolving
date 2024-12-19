/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // while()
        // while(headB != null){
        //     ListNode temp = headA;
        //     while(temp != null){
        //         if(temp == headB){
        //             return headB;
        //         }
        //     //  = headA.next;
        //     temp = temp.next;
        //     }
        //     headB = headB.next;
        // }
        // return null;

        ListNode temp = headA;
        Map<ListNode, Integer> nodeMap  = new HashMap<>();
        while(temp != null){
            nodeMap.put(temp, nodeMap.getOrDefault(temp, 0) + 1);
            temp = temp.next;
        }
        temp = headB;
        while(temp != null){
            if(nodeMap.containsKey(temp)){
                return temp;
            }
            // headB = headB.next;
            temp = temp.next;
        }
        return null;
    }
}