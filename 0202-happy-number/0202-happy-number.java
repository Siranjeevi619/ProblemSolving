class Solution {
    static int divideAndSum(int n){
        int sum = 0;
        while(n > 0){
            int num = n % 10;
            sum += Math.pow(num, 2);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        int num = n;
        Set<Integer> set = new HashSet<>();
        while(!set.contains(num)){
             if(num == 1){
                return true;
            }
            set.add(num);
            num = divideAndSum(num);
        }
        return false;
    }
}