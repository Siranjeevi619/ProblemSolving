class Solution {

    public void rotate(int[][] matrix) {
        int start = 0;
        int end = matrix.length-1;
        while(start < end){
            int [] temp = matrix[start];
            matrix[start] = matrix[end];
            matrix[end] = temp;
            start+=1;
            end-=1;
        } 
        for(int i = 0 ; i < matrix.length;i+=1){
            for(int j = i+1;j<matrix[0].length;j+=1)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
    }
}