class Solution {
    public int countHomogenous(String s) {
        int left = 0, right = 0;
        long counter = 0;
        char [] arr = s.toCharArray();
        int arrSize = arr.length;
        while(right < arrSize){
            if(arr[left] ==arr[right]){
                counter += right - left + 1;
            }
            else{
                counter+=1;
                left = right;
            }
            right+=1;
        }
        return (int)(counter % (1e9+7)); 
    }
}