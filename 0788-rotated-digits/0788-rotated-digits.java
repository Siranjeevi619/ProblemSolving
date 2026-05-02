class Solution {

    static boolean isGood(int n) {
        boolean changed = false;

        while (n > 0) {
            int d = n % 10;
            if (d == 3 || d == 4 || d == 7) return false;
            if (d == 2 || d == 5 || d == 6 || d == 9) {
                changed = true;
            }
            n /= 10;
        }

        return changed;
    }

    public int rotatedDigits(int n) {
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isGood(i)) count++;
        }

        return count;
    }
}