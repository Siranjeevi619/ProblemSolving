class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int size = cardPoints.length;
        int left = 0 ,  right = 0, sum = 0;
        for(int i = 0 ; i< k ; i +=1){
            left += cardPoints[i];
        }
        sum = left;
        int rightEnd = size-1;
        for(int i = k -1; i >= 0;i-=1){
            left -= cardPoints[i];
            right += cardPoints[rightEnd];
            rightEnd-=1;
            sum = Math.max(sum, right+left);
        }
        return sum;
    }
}