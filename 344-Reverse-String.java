class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int sLength = s.length;
        int high = sLength -1;
        while(low <= high){
        char temp = s[low];
        s[low] = s[high];
        s[high] = temp;
        low++;
        high--;
        }
        
    }
}