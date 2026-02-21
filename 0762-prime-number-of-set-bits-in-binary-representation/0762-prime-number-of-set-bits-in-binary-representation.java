class Solution {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i += 1) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean countBits(int i) {
       
        return isPrime(Integer.bitCount(i));
    }

    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i += 1) {
            if (countBits(i)) {
                count += 1;
            }
        }
        return count;
    }
}