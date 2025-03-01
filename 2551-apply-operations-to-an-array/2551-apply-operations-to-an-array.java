class Solution {
    public int[] applyOperations(int[] nums) {
        int numsSize = nums.length;
        for (int i = 0; i < numsSize - 1; i += 1) {
            if (nums[i] != nums[i + 1]) {
            } else {
                nums[i] *= 2;
                nums[i + 1] = 0;

            }
        }
        ArrayList<Integer> nonZero = new ArrayList<>();

        for(int i : nums){
            if( i > 0){
                nonZero.add(i);
            }
        }
        int k = 0;
        for(int i : nonZero){
          nums[k] = i ;
          k+=1;
        }
        for(int i = k ; i < numsSize ; i+=1){
            nums[i] = 0;
        }

        return nums;

    }
}