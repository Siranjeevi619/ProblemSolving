class Solution {
    static boolean isPalindrome(String str , int start ,int end){
        while(start<= end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start +=1;
            end--;
        }
        return true;
    }
    static void findPartition(int index, String s ,   List<List<String> > result , List<String> ds ){
        if(index == s.length()){
            result.add(new ArrayList<>(ds));
            return ;
        }
        for(int i = index ; i < s.length(); i++){
            if(isPalindrome(s, index, i)){
                // findPartition(s.subS)
                ds.add(s.substring(index, i+1));
                findPartition(i+1, s, result, ds);
                ds.remove(ds.size() -1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String> > result = new ArrayList<>();
        findPartition(0 , s, result, new ArrayList<>());
        return result;
    }
}