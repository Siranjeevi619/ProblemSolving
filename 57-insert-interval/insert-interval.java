class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int []> ans = new ArrayList<>();
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            ans.add(intervals[i]);
            i+=1;
        }

        while(i < intervals.length && intervals[i][0] <= newInterval[1]){
            newInterval[0] = Math.min(intervals[i][0], newInterval[0] );
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }

        ans.add(newInterval);
        while(i< intervals.length ){
            ans.add(intervals[i]);
            i+=1;
        }
        int [][] res = new int[ans.size()][2];
        for(int ins = 0 ; ins < ans.size() ; ins+=1){
            res[ins][0] = ans.get(ins)[0];
            res[ins][1] = ans.get(ins)[1];
        }
        return res;

    }
}