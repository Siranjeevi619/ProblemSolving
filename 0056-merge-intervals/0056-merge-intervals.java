class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        for (int[] interval : intervals) {
            int start = interval[0];
            int end = interval[1];

            if (res.isEmpty() || res.get(res.size() - 1).get(1) < start) {
                ArrayList<Integer> ans = new ArrayList<>();
                ans.add(start);
                ans.add(end);
                res.add(ans);
            } else {
                res.get(res.size() - 1).set(
                    1,
                    Math.max(end, res.get(res.size() - 1).get(1))
                );
            }
        }

        int[][] result = new int[res.size()][2];

        for (int i = 0; i < res.size(); i++) {
            result[i][0] = res.get(i).get(0);
            result[i][1] = res.get(i).get(1);
        }

        return result;
    }
}
