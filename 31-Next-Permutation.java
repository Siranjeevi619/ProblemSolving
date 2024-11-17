class Solution {
    static void reverseArray(int [] nums, int i, int j){
        while(i < j){
            swap(nums, i,j);
            i++;
            j--;
        }
    }

    static void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void nextPermutation(int[] nums) {
        int numsSize = nums.length;
        int index = -1 ;
        for(int i=numsSize -2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverseArray(nums, 0,numsSize-1);
            return;
        }
        for(int i=numsSize-1;i > index;i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        reverseArray(nums, index+1, numsSize-1);
    }
}