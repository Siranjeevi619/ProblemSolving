class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        // Collect all values from all lists
        for (ListNode head : lists) {
            while (head != null) {
                arr.add(head.val);
                head = head.next;
            }
        }

        // Sort the values
        Collections.sort(arr);

        // Create new sorted linked list
        ListNode dummyNode = new ListNode(-1);
        ListNode current = dummyNode;

        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return dummyNode.next;
    }
}
