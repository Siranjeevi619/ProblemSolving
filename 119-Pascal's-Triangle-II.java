class Solution {
    public List<Integer> getRow(int rowIndex) {
    
         List<List<Integer>> triangle = new ArrayList<>();
        
        for(int i  = 0 ; i<= rowIndex ; i++){
            List<Integer> rows = new ArrayList<>();
            for(int j = 0 ; j <= i ; j +=1){
                if(j == 0 || j ==i ){
                    rows.add(1);
                }
                else{
                    List<Integer> previous = triangle.get(i-1);
                    rows.add(previous.get(j) + previous.get(j-1));
                }
            }
            triangle.add(rows);
        }
        return triangle.get(rowIndex);
    }
}