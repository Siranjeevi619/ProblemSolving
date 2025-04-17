class Solution {
    static boolean check(int [] nums, int  i, int j,int k){
        return (nums[i] == nums[j] ) && (i * j % k == 0);
    }
    public int countPairs(int[] nums, int k) {
        int numsSize = nums.length;
        int count = 0;
        for(int i = 0;  i < numsSize ; i +=1){
            for(int j = i+1; j < numsSize ; j +=1){
                if(check(nums, i , j, k)){
                    System.out.println(i + ' '+j+" "+nums[i]+" "+nums[j]);
                    count +=1;
                }
            }
        }
        return count;
    }
}