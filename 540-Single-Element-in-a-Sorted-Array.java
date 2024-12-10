class Solution {
    public int singleNonDuplicate(int[] nums) {
        int numsSize = nums.length,j,an=-1;
        if(numsSize == 0){
            return -1;
        }
        if(numsSize==1){
            return nums[0];
        }
        int maxNumber = 0;
        for(int i : nums){
            if(maxNumber < i){
                maxNumber = i;
            }
        }
    //    return maxNumber;
        // int [] freq = new int[1000];
        
        // for(int i=1;i<1000; i++){
        //     freq[nums[i]]++;
        // }
        // for(int i=0;i<1000;i++){
        //     if(freq[i] == 1){
        //         return freq[i];
        //     }
        // }
        int [] freq=new int[maxNumber+1];
        for(int a:nums)
        {
            freq[a]++;
        }
    for(int i=0;i<=maxNumber;i++){
            if(freq[i] == 1){
                an=i;
            }
        }
        return an;
    }
}