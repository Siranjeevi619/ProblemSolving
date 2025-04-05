class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int left = 0, right = 0, maxLength = 0;
        int size = fruits.length;
        while (right < size) {
            mpp.put(fruits[right], mpp.getOrDefault(fruits[right], 0) + 1);
            if (mpp.size() > 2) {
                mpp.put(fruits[left], mpp.get(fruits[left]) - 1);
                if (mpp.get(fruits[left]) == 0) {
                    mpp.remove(fruits[left]);
                }
                left += 1;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right += 1;
        }
        return maxLength;
    }
}