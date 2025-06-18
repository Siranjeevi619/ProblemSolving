class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int [] sorted = nums.clone();
        int i = 0;
        Arrays.sort(sorted);
        int j = nums.length - 1;
        while(i <= j){
            if(nums[i] != sorted[i] && nums[j] != sorted[j] ) break;
            if(nums[i] == sorted[i]) i++;
            if(nums[j] == sorted[j]) j-=1;
        }
        return (i > j) ? 0 : j - i +1;
    }
}