class Solution {
    public boolean doesValidArrayExist(int[] derived) {
          int xr = 0;
        for (int val : derived) {
            xr ^= val;
        }
        return xr == 0;
    }
}