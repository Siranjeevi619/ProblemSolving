class Solution {
    static int reverse(int n){
        int num = 0;
        while(n > 0){
            int rem = n%10;
            num = num * 10 + rem;
            n/=10;
        }
        return num;
    }
    public int mirrorDistance(int n) {
        int rev = reverse(n);
        return Math.abs(rev - n);
    }
}