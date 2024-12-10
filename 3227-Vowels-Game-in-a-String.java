class Solution {
    public boolean doesAliceWin(String s) {
        char[] ch = s.toCharArray();
        int count=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
                count++;
            }
        }
        if(count<1) return false;
        return true;
    }
}