class Solution {
    public int[] sortedSquares(int[] nums) {
        int arrSize = nums.length;
        int[] result = new int[arrSize];
        int low = 0;
        int high = arrSize - 1;
        int position = arrSize - 1;
        
        // Process the array from both ends
        while (low <= high) {
            int lowSquare = nums[low] * nums[low];
            int highSquare = nums[high] * nums[high];
            
            if (lowSquare > highSquare) {
                result[position--] = lowSquare;
                low++;
            } else {
                result[position--] = highSquare;
                high--;
            }
        }
        
        return result;
    }
}
