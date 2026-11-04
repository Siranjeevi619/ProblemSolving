class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex == 0){
            List<Integer> res = new ArrayList<>();
            res.add(1);
            return res;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0 ; i < rowIndex+1 ; i+=1){
            List<Integer> res = new ArrayList<>();
            for(int j = 0 ; j <=i ; j+=1){
                if(j == 0 || j == i){
                    res.add(1);
                }
                else{
                    List<Integer> prev = result.get(i-1);
                    res.add(prev.get(j) + prev.get(j-1));
                }
            }
            result.add(res);
        }
        System.out.println(result.toString());
        return result.get(rowIndex);
    }
}