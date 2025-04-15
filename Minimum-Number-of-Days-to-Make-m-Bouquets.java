class Solution {
    public static int findMax(int[] v) {
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < v.length; i++) {
            maxi = Math.max(maxi, v[i]);
        }
        return maxi;
    }

    static int findMin(int[] v) {
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < v.length; i += 1) {
            mini = Math.min(mini, v[i]);
        }
        return mini;
    }

    static boolean check(int[] bloom, int days, int m, int k) {
        int flower = 0;
        int bouquets = 0;
        for (int i = 0; i < bloom.length; i += 1) {
            if (bloom[i] <= days) {
                flower += 1;
                if (flower == k) {
                    bouquets += 1;
                    flower = 0;
                }

            } else {
                flower = 0;
            }
        }
        return bouquets >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        long totalFlowersNeeded = (long) m * k;
        if (bloomDay.length < totalFlowersNeeded)
            return -1;
        int maxValue = findMax(bloomDay);
        int minValue = findMin(bloomDay);
        int count = 0;
        // for (int i = minValue; i <= maxValue; i += 1) {
        //     if (check(bloomDay, i, m, k)) {
        //         return i;
        //     }
        // }
        // return -1;
        int result = -1;
        while (minValue <= maxValue) {
            int mid = (maxValue
                    + minValue) / 2;
            if (check(bloomDay, mid, m, k)) {
                result = mid;
                maxValue = mid - 1;
            } else {
                minValue = mid + 1;
            }

        }
        return minValue;
    }
}