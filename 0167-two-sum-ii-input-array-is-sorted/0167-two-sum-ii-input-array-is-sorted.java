class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int left = 0;
       
        int right = numbers.length -1;
        while(left <= right){
            int sum = numbers[left] + numbers[right];
            if( sum== target){
                return new int []{left + 1, right + 1};
            }
            else if(sum > target){
                right-=1;
            }
            else{
                left+=1;
            }
        }
        Arrays.fill(res, -1);
        return res;
    }
}