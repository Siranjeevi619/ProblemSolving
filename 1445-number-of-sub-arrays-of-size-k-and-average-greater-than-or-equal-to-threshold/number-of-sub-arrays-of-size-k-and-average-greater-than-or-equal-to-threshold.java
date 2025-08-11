class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int count = 0;
        int avgSum = 0;
        for(int i = 0 ; i < k ; i += 1){
            avgSum += arr[i];
        }
        if(avgSum / k >= threshold){
            count +=1;
        }
        for(int i = k ; i < arr.length;i+=1){
            avgSum = avgSum + arr[i] - arr[i - k];
            if(avgSum / k >= threshold){
                count+=1;
            }
        }
        return count;
    }
}
