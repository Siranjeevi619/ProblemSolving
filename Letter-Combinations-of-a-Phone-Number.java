class Solution {
    static void backTrack(String digits, int ind, StringBuilder comb, List<String> res,Map<Character, String> mpp )
    {
        if(ind == digits.length()){
            res.add(comb.toString());
            return ;
        }
        String letter = mpp.get(digits.charAt(ind));
        for(char ch : letter.toCharArray()){
            comb.append(ch);
            backTrack(digits, ind+1, comb, res, mpp);
            comb.deleteCharAt(comb.length() -1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
         
        if (digits == null || digits.length() == 0) {
            return res;
        }
        HashMap<Character , String> mpp = new HashMap<>();
        mpp.put('2', "abc");
        mpp.put('3', "def");
        mpp.put('4', "ghi");
        mpp.put('5', "jkl");
        mpp.put('6', "mno");
        mpp.put('7', "pqrs");
        mpp.put('8',"tuv");
        mpp.put('9', "wxyz");
        // if(digits == ""){
        //     return res;
        // }

    backTrack( digits, 0,  new StringBuilder() ,  res, mpp );
    return res;
}}