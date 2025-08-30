class Solution {
    public int[] shuffle(int[] nums, int n) {
        ArrayList<Integer> ls = new ArrayList<>();
          for(int i = 0; i < n; i+=1){
            ls.add(nums[i]);
            ls.add(nums[i+n]);
        }
        int [] res = new int[ls.size()];
        for(int i = 0 ; i < ls.size() ; i+=1){
            res[i] = ls.get(i);
        }
        return res;
    }
}