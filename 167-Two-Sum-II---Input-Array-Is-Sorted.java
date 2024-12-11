class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int numsSize = numbers.length;
        int [] result = new int[2];
        // if(numsSize == 2){
        //     result[0]
        //     return numbers[0] + numbers[1];
        // }
        if(numbers[0] + numbers[numsSize - 1] == target){
            result[0] = 1;
            result[1] = numsSize;
            return result;
        }
        int left = 0;
        int right = numsSize - 1;
        while(left <= right){
            int sum = numbers[left] + numbers[right];
            if ( sum== target){
                result[0] = left+1;
                result[1] = right+1;
                break;
            }
            else if( sum > target){
                right -=1;
            }
            else{
                left +=1;
            }
        }
        return result;
    }
}