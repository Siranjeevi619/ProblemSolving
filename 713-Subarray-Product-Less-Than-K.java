class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int total) {
        // int numsSize = nums.length;
        // int count = 0;
        // for(int i=0;i<numsSize;i++){
        //     for(int j=i;j<numsSize;j++){
        //         int mul = 1;
        //         for(int k=i;k<=j;k++){
        //             mul *= nums[k];
        //         }

        //         if( mul < total ){
        //             count += 1;
        //         }
        //     }
        // }
        // return count;


        int count  = 0;
        int numsSize = nums.length;
        for(int i = 0;i < numsSize ; i++){
            int mul = 1;
            for(int j = i; j < numsSize;j++){
                mul *= nums[j];
                if ( mul < total){
                    count += 1;
                }
                else{
                    break;
                }
            }
        }
        return count;
        
    }
}