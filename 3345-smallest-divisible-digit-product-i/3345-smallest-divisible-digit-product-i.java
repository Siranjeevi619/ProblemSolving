class Solution {
    static int sumOfDigits(int n){
        int sum = 1;
        while(n > 0){
            int rem = n % 10;
            sum *= rem;
            n /=10;
        }
        return sum;
    }
    public int smallestNumber(int n, int t) {
        int range = n * t;
        for(int i = n ; i <= range ; i+=1){
            int digitSum = sumOfDigits(i);
            if(digitSum % t == 0){
                return i;
            }
        }
        return -1;
    }
}