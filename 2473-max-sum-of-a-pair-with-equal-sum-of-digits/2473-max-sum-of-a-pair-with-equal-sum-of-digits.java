class Solution {
    static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public int maximumSum(int[] nums) {
        int sum = -1;
        int numsSize = nums.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < numsSize; i += 1) {
            int max = sumOfDigits(nums[i]);
            if (mpp.containsKey(max)) {
                sum = Math.max(sum, mpp.get(max) + nums[i]);
                mpp.put(max, Math.max(mpp.get(max), nums[i]));
            }
            else{
                mpp.put(max, nums[i]);
            }
        }
        return sum;
    }
}