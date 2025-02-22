class Solution {
    public String largestNumber(int[] nums) {
        ArrayList<String> ls = new ArrayList<>();
        for(int i = 0; i < nums.length ; i+=1){
            ls.add(Integer.toString(nums[i]));
        }
        ls.sort((a,b) -> {
            if((a+b).compareTo(b+a) > 0)return -1;
            return 1;
        });

        String result = "";
        for(int i = 0; i < ls.size();i+=1){
            result+=ls.get(i);
        }
        if(result.charAt(0) == '0'){
            return "0";
        }
        return result;

    }
}