class Solution {
    public int findFinalValue(int[] nums, int original) {
        int num = 0;
        for(int i : nums){
             if(original == i){
                num = (i*  2);
            }
        }
        if(num == 0){
            return original;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int x : nums) arr.add(x);


        for(int i =0 ; i < arr.size();i+=1){
            if(arr.contains(num)){
                num = num *2;
            }
            else{
                return num;
            }
        }
        return num == 0 ? original : num;
    }
}