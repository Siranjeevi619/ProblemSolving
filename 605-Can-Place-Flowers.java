class Solution {
    public boolean canPlaceFlowers(int[] arr, int n) {
        // int bedSize = arr.length;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                boolean left = (i == 0 || arr[i - 1] == 0);
                boolean right = (i == arr.length - 1 || arr[i + 1] == 0 );
                if (left && right) {
                    count += 1;
                    arr[i] = 1;
                }

            }

        }
        return n <= count;
    }
}