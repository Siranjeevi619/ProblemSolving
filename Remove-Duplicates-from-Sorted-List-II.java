class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> mpp = new HashMap<>();
        ListNode temp = head;
        while (temp != null) {
            mpp.put(temp.val, mpp.getOrDefault(temp.val , 0)+1);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
         temp = head;
        while (temp != null) {
            if (mpp.get(temp.val) == 1) {
                curr.next = new ListNode(temp.val);
                curr = curr.next;
            }
            temp = temp.next;
        }
        return dummy.next;
    }
}
