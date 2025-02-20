class Solution {
    public String findDifferentBinaryString(String[] nums) {
        String str = "";
        for(int i = 0; i < nums.length; i++)
            str += nums[i].charAt(i) == '0' ? '1': '0';
        return str; 
    }
}