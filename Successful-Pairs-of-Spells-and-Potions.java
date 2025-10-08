import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length, m = potions.length;
        int[] res = new int[n];
        
        for (int i = 0; i < n; i++) {
            int spell = spells[i];
            int low = 0, high = m - 1;
            int idx = m; 
            
            while (low <= high) {
                int mid = (low + high) / 2;
                long product = (long) spell * potions[mid];
                
                if (product >= success) {
                    idx = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            
            res[i] = m - idx;
        }
        return res;
    }
}
