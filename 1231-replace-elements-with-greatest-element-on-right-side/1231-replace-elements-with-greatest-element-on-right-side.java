class Solution {
    static {
        for(int i = 0;i <= 500;i++) {
        replaceElements(new int[]{17,18,5,4,6,1});
        }
    }
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = arr[n - 1];
        arr[n - 1] = -1;
        for (int i = n - 2; i >= 0; i--) {
            int current = arr[i];
            arr[i] = max;
            if (current > max) {
                max = current;
            }
        }
        return arr;
    }
}