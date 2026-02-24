class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        // HashSet<Integer> set = new HashSet();
        int left = 0;
        int maxLen = 0;
        for (int right = 0; right < fruits.length; right += 1) {
            mpp.put(fruits[right], mpp.getOrDefault(fruits[right], 0)+1);
            // set.add(fruits[right]);

            while (mpp.size() > 2) {
                mpp.put(fruits[left], mpp.getOrDefault(fruits[left] , 0 ) - 1);
                if(mpp.get(fruits[left]) == 0){
                    mpp.remove(fruits[left]);
                }
                
                left += 1;
            }
           
                maxLen = Math.max(maxLen, right - left + 1);
                System.out.print(maxLen + "  ");
            

        }
        return maxLen;
    }
}