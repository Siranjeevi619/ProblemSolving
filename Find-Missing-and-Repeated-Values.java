class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> mpp= new HashMap<>();
        int gridSize = grid.length;
        for(int i = 0 ; i < gridSize ; i+=1){
            for(int j = 0 ; j < gridSize ; j+=1){
                mpp.put(grid[i][j], mpp.getOrDefault(grid[i][j], 0)+1);
            }
        }
        int totalSize = gridSize * gridSize;
        int duplicate = -1;
        int missing = -1;
        for(int i = 1; i <= totalSize ; i+=1 ){
            if(!mpp.containsKey(i)){
                duplicate = i;
            }
            if(mpp.containsKey(i)&& mpp.get(i) == 2){
                missing = i;
            }
        }
        return new int[] {missing, duplicate};
    }
}