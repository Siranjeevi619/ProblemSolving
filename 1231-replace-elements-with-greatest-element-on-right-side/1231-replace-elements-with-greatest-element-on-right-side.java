class Solution {
    static int findNum(int [] arr, int start){
        int max = (int) -1e9;
        for(int i = start ; i < arr.length ; i+=1){
           max = Math.max(max, arr[i]);
        }
        return max;
    }
    public int[] replaceElements(int[] arr) {
        int arrSize = arr.length;
        if(arrSize == 1){
            return new int[]{-1};
        }
        for(int i = 0 ; i < arrSize - 1 ;i++){
            int nextGreat = findNum(arr, i+1);
            arr[i] = nextGreat;
        }
        arr[arrSize - 1] = -1;
        return arr;
    }
}