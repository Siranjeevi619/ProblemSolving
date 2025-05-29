class Solution {
    static int check(int [] nums, int ind){
        int student = 1, pages = 0;
        for(int i = 0 ; i< nums.length ; i+=1){
            if(pages + nums[i] <= ind){
                pages+= nums[i];
            }
            else{
                student +=1;
                pages = nums[i];
            }
        }
        return student;
    }
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i : nums){
            start = Math.max(i , start);
            end += i;
        }
        while(start <= end){
            int mid =( start+end) / 2;
            if(check(nums, mid) > k){
                 start= mid+1;
                
            }
            else{
                end = mid-1;
               
            }
        }
        return start;
    }
}