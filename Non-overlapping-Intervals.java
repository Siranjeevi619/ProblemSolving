class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 1;
        int intervalSize = intervals.length;
        int lastInterval = intervals[0][1];
        for (int i = 1; i < intervals.length; i += 1) {
            if (intervals[i][0] >= lastInterval) {
                count += 1;
                lastInterval = intervals[i][1];
            }
        }
        return intervalSize - count;
    }
}