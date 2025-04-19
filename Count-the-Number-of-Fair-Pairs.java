class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {


        // for(int i = 0; i < numsSize ;  i +=1){
        //     for(int j =i +1 ; j < numsSize ; j +=1){
        //         int sum = nums[i]+ nums[j];
        //         if(lower <= sum && sum <= upper){
        //             counter+=1;
        //         }
        //     }
        // }

        Arrays.sort(nums);
        return check(nums, upper) - check(nums, lower -1);
       
    }
    static long check(int [] nums, int value){
         long counter = 0;
         int numsSize = nums.length;
         for(int left = 0, right = numsSize - 1;left < right ; left++ ){
            while(left < right && nums[left] + nums[right] > value){
                right--;
            }
            counter += right - left;
         }
        return counter;
    }
}