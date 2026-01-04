class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum = 0;

        for (int i : nums) {
            int divisorSum = 0;
            int count = 0;

            for (int d = 1; d * d <= i; d++) {
                if (i % d == 0) {
                    int other = i / d;

                    if (d == other) {
                        count += 1;
                        divisorSum += d;
                    } else {
                        count += 2;
                        divisorSum += d + other;
                    }

                    if (count > 4) break;
                }
            }

            if (count == 4) {
                sum += divisorSum;
            }
        }

        return sum;
    }
}
