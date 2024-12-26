class Solution {
    public boolean isBalanced(String num) {
        String [] nums = num.split("");
        int oddCount = 0;
        int evenCount = 0;
        // int i = 0;
        // int j = 1;
        int numsSize = nums.length ;
        // while(i < numsSize  && j < numsSize ){
        //     evenCount += Integer.parseInt(nums[i]);
        //     oddCount += Integer.parseInt(nums[j]);
        //     i+=2;
        //     j+=2;
        // }
        for(int i = 0; i < numsSize ; i++){
            if(i % 2 == 0){
                evenCount +=Integer.parseInt(nums[i]);
            }else{
                  oddCount +=Integer.parseInt(nums[i]);
            }
        }
        return oddCount == evenCount;
    }
}