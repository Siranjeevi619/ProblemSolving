class Solution {
    public int[][] merge(int[][] intervals) {
        int intervalsSize = intervals.length;
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int [] a, int [] b){
                return a[0] - b[0];
            }
        });
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        for(int i = 0 ;i < intervalsSize; i+=1){
            if(arr.isEmpty() || arr.get(arr.size()-1).get(1) < intervals[i][0]){
                arr.add(new ArrayList<>(Arrays.asList(intervals[i][0], intervals[i][1])));
            }
            else{
                arr.get(arr.size() -1 ).set(1, Math.max(arr.get(arr.size()-1).get(1), intervals[i][1]));
            }
        }
        int rowSize = arr.size();
        int colSize = arr.get(0).size();
        int [][] result = new int[rowSize][colSize];
        for(int i = 0; i < rowSize ; i+=1){
            for(int j = 0; j < colSize ; j+=1){
                result[i][j] = arr.get(i).get(j);
            }
        }
        return result;
    }
}