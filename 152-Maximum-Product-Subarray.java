class Solution {
    public int maxProduct(int[] nums) {
        int productValue = Integer.MIN_VALUE;
        int numsSize = nums.length;
        // for(int i=0;i<numsSize;i++){
        //     for(int j=i+1;j<numsSize;j++){
        //         int pro = 1;
        //         for(int k = i; k<=j;k++){
        //             pro *= nums[k];
        //         }
        //         productValue = Math.max(productValue, pro);
        //     }
        // }

        for(int i=0;i<numsSize;i++){
            int pro = 1;
            for(int j=i;j< numsSize;j++){
                pro *= nums[j];
                productValue = Math.max(productValue, pro);
            }
        }

        return productValue;
    }
}