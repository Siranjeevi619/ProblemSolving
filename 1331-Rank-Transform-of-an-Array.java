class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int N = arr.length;
        int[] result = new int[N];
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int[] dup = new int[N];
        int bsize = 0;
        for (int i : arr) {
            dup[bsize++] = i;

        }
        int temp = 1;
        Arrays.sort(dup);
        for (int i = 0; i < N; i += 1) {
            if (mpp.get(dup[i]) == null) {
                mpp.put(dup[i], temp++);
            }
        }
        for (int i = 0; i < N; i += 1) {
            result[i] = mpp.get(arr[i]);
        }
        return result;
    }
}