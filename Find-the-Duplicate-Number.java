class Solution {
    public int findDuplicate(int[] nums) {
          int [] freq = new int[1000000];
	        int size = nums.length;
	        int maxElement = Integer.MIN_VALUE; 
	        for(int i=0;i<size; i++){
	            freq[nums[i]]++;
	        }
	        int ans = -1;
	        for(int i=0;i<size;i++){
	            if(freq[i] >1){
	                ans = i;
	            }
	        }
	        return ans;

    }
}