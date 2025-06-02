class Solution {
    public int candy(int[] ratings) {
        int ratingSize = ratings.length;
        int[] left = new int[ratingSize];
        int[] right = new int[ratingSize];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for (int i = 1; i < ratingSize; i += 1) {
            if (ratings[i] > ratings[i - 1]) {
                left[i] = left[i - 1] + 1;
            }
        }
        for (int i = ratingSize - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                right[i] = right[i + 1] + 1;
            }
        }

        int res = 0;
        for(int i = 0 ; i < ratingSize ; i+=1){
            res += Math.max(left[i], right[i]);
        }
        return res;
    }
}