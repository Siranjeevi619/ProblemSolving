class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int size = matrix.length;
        long totalSum = 0;
        int negativeCount = 0;
        int minAbsValue = (int) 1e9;
        for(int i = 0 ; i  < size ; i+=1){
            for(int j = 0 ; j < size ; j +=1){
                int currValue = matrix[i][j];
                totalSum += Math.abs(currValue);
                if(currValue < 0){
                    negativeCount +=1;
                }
                minAbsValue = Math.min(minAbsValue, Math.abs(currValue));
            }
        }
        if(negativeCount % 2 ==0){
            return totalSum;
        }
        else{
            return totalSum - 2 * minAbsValue;
        }
    }
}