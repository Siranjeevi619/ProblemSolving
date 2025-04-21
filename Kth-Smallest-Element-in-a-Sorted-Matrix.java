class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        if(matrix.length ==1){
            return matrix[0][0];
        }
        int counter = 1;
        ArrayList<Integer> ls = new ArrayList<>();
        for(int [] mat : matrix){
            for(int i : mat){
                ls.add(i);
            }
        }
        Collections.sort(ls);
        return ls.get(k-1);
    }
}