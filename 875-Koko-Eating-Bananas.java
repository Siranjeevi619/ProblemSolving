class Solution {
    static int findMax(int [] arr){
        int maxi = Integer.MIN_VALUE;
        int arrSize = arr.length;
        for(int i = 0;i<arrSize ;i++){
            maxi = Math.max(arr[i] , maxi);
        }
        return maxi;
    }
    static int findHour(int [] arr , int hour){
        int totalhour = 0;
        for(int i=0;i<arr.length;i++){
            totalhour += Math.ceil( (double) (arr[i] )/ (double) hour);
        }
        return totalhour;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        // int pilesSize = piles.length;
        int high =  findMax(piles);
        // int result = -1;
        while(low <= high){
              int mid = (low + high)/ 2;
            int currentValue = findHour(piles, mid);
            if(currentValue <= h){
                // result = currentValue;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}