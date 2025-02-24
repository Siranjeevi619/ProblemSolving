class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int arrSize = arr.length;
        for (int i = 0; i < arrSize; i += 1) {
            for (int j = i + 1; j < arrSize; j += 1) {
                if (Math.abs(arr[i] - arr[j]) <= a) {
                    for (int k = j + 1; k < arrSize; k+=1) {
                        if ((Math.abs(arr[j] - arr[k]) <= b) && (Math.abs(arr[i] - arr[k]) <= c)) {
                            count += 1;
                        }
                    }
                }
            }
        }
        return count;
    }
}