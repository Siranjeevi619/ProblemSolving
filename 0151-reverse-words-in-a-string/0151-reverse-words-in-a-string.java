class Solution {
    public String reverseWords(String s) {
        String[] sub = s.split("\\s+");
        int left = 0;
        int right = sub.length -1;
        while(left <= right){
            String temp = sub[left];
            sub[left] = sub[right];
            sub[right] = temp;
            left+=1;
            right -=1;
        }
        String res = "";
        for(String si : sub){
            res+= si+" ";
        }
        return res.trim();

    }
}