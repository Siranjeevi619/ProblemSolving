class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        System.out.println(Arrays.deepToString(intervals));
        ArrayList<Integer> res = new ArrayList<>();
        res.add(intervals[0][0]);
        res.add(intervals[0][1]);
        ans.add(res);
        System.out.println(ans.get(0).get(1));

        for (int i = 1; i < intervals.length; i += 1) {
            ArrayList<Integer> last = ans.get(ans.size() - 1);

            if (last.get(1) < intervals[i][0]) {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(intervals[i][0]);
                temp.add(intervals[i][1]);
                ans.add(temp);
            } else {
                last.set(1, Math.max(last.get(1), intervals[i][1]));
            }
        }
        int [][] result = new int[ans.size()][2];
        for(int i = 0 ; i < ans.size() ; i+=1){
            for(int j = 0 ; j < 2 ;  j+=1){
                result[i][j] = ans.get(i).get(j);
            }
        }
        
        return result; 
    }
}