class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int len = arr.length;

        for (int i = 0; i < len; i += 2 * k) {
            int left = i;
            int right = Math.min(i + k - 1, len - 1);
            while (left < right) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        
        return new String(arr);
    }
}
