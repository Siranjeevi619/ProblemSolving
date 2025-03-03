class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int numsSize = nums.length;
        int[] result = new int[numsSize];
        int idx = 0;
        for (int i : nums) {
            if (i < pivot) {
                result[idx] = i;
                idx += 1;
            }
          
        }
        for(int i : nums){
            if( i == pivot){
                result[idx] = i;
                idx +=1;
            }
        }

        for(int i : nums){
            if(i > pivot){
                result[idx] = i;
                idx +=1;
            }
        }
        return result;


    }
}