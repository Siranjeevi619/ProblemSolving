class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int currNum = 1;
        for (int i : nums) {
            if (i <= 0) {
                continue;
            }
            if (i == currNum) {
                currNum += 1;
            }
            if (i > currNum) {
                return currNum;
            }
        }
        return currNum;
    }
}