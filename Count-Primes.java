class Solution {
    public int countPrimes(int n) {
        if(n <= 1){
            return 0;
        }
        boolean [] isPrime = new boolean [n];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for(int i = 2 ; i*i <  n ; i+=1 ){
            if(isPrime[i]){
                for(int j = i*i ; j < n; j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for(boolean i : isPrime) 
        if(i) count+=1;

        return count;
    }
}