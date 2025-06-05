class Solution {
    static ArrayList<int[]> findInterval(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> res = new ArrayList<>();
        res.add(arr[0]);
        for (int i = 1; i < arr.length; i += 1) {
            int[] last = res.get(res.size() - 1);
            int[] curr = arr[i];
            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                res.add(curr);
            }
        }
        return res;
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> intervalList = new ArrayList<>(Arrays.asList(intervals));
        intervalList.add(newInterval);
        
        int[][] mergedInput = intervalList.toArray(new int[0][]);
        ArrayList<int[]> merged = findInterval(mergedInput);
        
        return merged.toArray(new int[0][]);
    }
}
