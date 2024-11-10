class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        int org = x;
        int palinHold = 0;
        while(x > 0){
            int temp = x%10;
            palinHold = palinHold * 10 + temp;
            x/=10;
        }
        return (org == palinHold);
    }
}