/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    static void reverseArray(int[] arr, int i, int j) {
        // int low = i;
        // int high = j;
        while(i <=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        // List<Integer> NodeList = new ArrayList<>();
        ListNode temp = head;

        while (temp != null) {
            count += 1;
            // NodeList.add(temp.data);
            temp = temp.next;
        }

        temp = head;
        int[] arr = new int[count];

        int i = 0;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }
        // i = 0;
        // int j = k-1;
        // for(int a = 0;a<count / k;a++){
        //     // reverseArray(arr, a+i, j+i);
        //     i += k;
        //     j++;
        // }
        // int current = 0;
        // temp = head;
        // while(temp!= null){
        //     temp.val = arr[current];
        //     temp = temp.next;
        //     current += 1; 
        // }
        // return head;
        int a = 0,b=0;
        int [] swapArray = new int[count];
        for( i = 0;i < count / k;i++){
            for(int j = k - 1 ;j >=0;j--){
                swapArray[b++] = arr[j + a];
            }
            a = a+k;
        }

        for(i = a;i<count % k + a  ; i++){
            swapArray[b++] = arr[i];
        }

        temp = head;
        int currentPosition = 0;
        while(temp != null){
            temp.val =swapArray[currentPosition];
            currentPosition += 1;
            temp  = temp.next;
        }
        return head;

    }
}