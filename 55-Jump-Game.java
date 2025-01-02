class Solution {
    public boolean canJump(int[] nums) {
        // int far= 0;
        // int maxLenght = 0;
        // for(int i = 0; i < nums.length; i ++){
        //     if( far <= maxLenght ){
        //         far = Math.max(i+nums[i] , far);
        //     }
        //     if(i > far){
        //         return false;
        //     }
        // }
        // return true;
          int jump = 0 ;
          int l = 0, r = 0;
          for(int i  =  0 ;  i < nums.length; i+=1 ){
            if(l > r){
                return false;
            }
            jump = Math.max(jump,nums[i] + i);
            r = jump;
            l += 1;
          }
          return true;
    }
}