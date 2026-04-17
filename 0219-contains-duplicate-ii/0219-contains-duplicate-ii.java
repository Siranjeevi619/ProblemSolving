class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        int left = 0;
        for(int right = 0 ;right < nums.length ; right+=1){
            while(!set.isEmpty() && Math.abs(left - right) > k){
                set.remove(nums[left]);
                left+=1;
            }  
            if(set.contains(nums[right])){
                return true;
            }
            set.add(nums[right]);

        }
        return false;

        
    }
}