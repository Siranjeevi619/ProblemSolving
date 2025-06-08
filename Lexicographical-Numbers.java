class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            dfs(i, n, result);
        }
        return result;
    }

    static void dfs(int idx, int limit, List<Integer> result) {
        if (limit < idx) {
            return;
        }
        result.add(idx);
        for (int i = 0; i < 10; i++) {
            dfs(idx * 10 + i, limit, result);
        }
    }
}