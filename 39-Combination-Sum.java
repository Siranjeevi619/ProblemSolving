class Solution {
    static void helpFunction(int ind, int [] arr, int target, List<List<Integer>>ans, List<Integer> ds){
        if(ind == arr.length){
            if(target ==0){
                ans.add(new ArrayList<>(ds));
            }
            return ;
        }
        if(arr[ind] <= target){
            ds.add(arr[ind]);
            helpFunction(ind, arr, target -arr[ind], ans, ds);
            ds.remove(ds.size() -1);
        }
            helpFunction(ind+1, arr, target, ans, ds);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        helpFunction(0, candidates, target, result, new ArrayList<>());
        return result;
    }
}