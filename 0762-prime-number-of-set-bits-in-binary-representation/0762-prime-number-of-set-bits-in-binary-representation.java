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
        String ins = "" + Integer.toBinaryString(i);
        int oneCounter = 0;
        for (char ch : ins.toCharArray()) {
            if (ch == '1') {
                oneCounter += 1;
            }
        }
        return isPrime(oneCounter);
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