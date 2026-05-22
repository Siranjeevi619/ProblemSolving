class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0 ;
        int rightSum = 0;
        int maxSum = 0;
        for(int i = 0 ; i < k ; i++){
            leftSum += cardPoints[i];
        }
        maxSum= Math.max(leftSum, maxSum);
        int rightEnd = cardPoints.length - 1;
        for(int i = k - 1  ; i >= 0;i -= 1){
            leftSum -= cardPoints[i];
            rightSum += cardPoints[rightEnd];
            maxSum = Math.max(maxSum, leftSum + rightSum);
            rightEnd -=1;
        }
        return maxSum;
    }
}