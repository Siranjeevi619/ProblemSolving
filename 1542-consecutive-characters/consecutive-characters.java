class Solution {
    public int maxPower(String s) {
        int counter = 0;
        int max = 0;
        for(int i = 0; i < s.length()-1 ; i+=1){
            if(s.charAt(i) == s.charAt(i+1)){
                counter+=1;
            }
            else{
                counter = 0;
            }
            max = Math.max(counter, max);
        }
        return max+1;
    }

}