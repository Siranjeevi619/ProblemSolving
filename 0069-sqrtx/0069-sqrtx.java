class Solution {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int left = 0;
        int right = x / 2;
        while(left <= right){
            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;
            if(sqr == x){
                return mid;
            }
            if(sqr < x){
                left = mid+1;
               
            }
            else{
                right = mid - 1;
            }
        }
        return right;
    }
}