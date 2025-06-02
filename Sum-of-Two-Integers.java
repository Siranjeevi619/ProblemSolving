class Solution {
    static int sum(int a, int b){
        while(b != 0){
            int carry = (a & b) << 1;
            a = a ^ b;
            b = carry;
        }
        return a;
    }
    public int getSum(int a, int b) {
        return sum(a, b);
    }
}