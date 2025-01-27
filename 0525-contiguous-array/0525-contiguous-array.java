class Solution {
    public int findMaxLength(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        int preSum = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += (arr[i] == 0) ? -1 : 1;
            if (preSum == 0)
                res = i + 1;
            if (mp.containsKey(preSum))
                res = Math.max(res, i - mp.get(preSum));
            else
                mp.put(preSum, i);
        }

        return res;
    }
}