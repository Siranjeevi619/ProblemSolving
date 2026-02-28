class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1){
            return new int[]{-1};
        }
        int currentGreatest = -1;
        int MaxAtGreatest = -1;
        for(int i = arr.length - 1; i >= 0 ; i-=1){
            currentGreatest = arr[i];
            arr[i] = MaxAtGreatest;
            MaxAtGreatest = Math.max(MaxAtGreatest, currentGreatest);

            
              
        }
        return arr;
    }
}