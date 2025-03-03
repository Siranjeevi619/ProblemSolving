class Solution {
    public int majorityElement(int[] nums) {
        int pass = 0;
        int curr = 0;
        for(int i : nums){
            if(pass == 0){
                curr = i;
            }
            // {
                pass+= curr == i ? 1 : -1; 
            // }
            
        }
        return curr;
    }
}