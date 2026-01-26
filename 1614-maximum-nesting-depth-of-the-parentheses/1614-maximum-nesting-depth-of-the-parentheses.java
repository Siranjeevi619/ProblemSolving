class Solution {
    public int maxDepth(String s) {
        int maxCount = 0;
        int currCount = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                currCount +=1;
            }
            else if(ch == ')'){
                currCount -=1;
            }
            maxCount = Math.max(maxCount, currCount);
        }
        return maxCount;
    }
}