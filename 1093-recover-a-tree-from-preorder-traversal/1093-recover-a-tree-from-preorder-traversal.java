class Solution {
    int i = 0;
    public TreeNode rec(char[] c,int level){
        //get num
        int num = 0;
        while(i < c.length && c[i] != '-'){
            num = num * 10 + (c[i] - '0');
            i++;
        }
        TreeNode h = new TreeNode(num);
        //left
        int l = 0;
        while(i < c.length && c[i] == '-' ){
            i++;
            l++;
        }
        TreeNode left = null;
        if(l <= level)  {
            i -= l;
            return h;
        }
        if(l > level){
            left = rec(c,level+1);
        }
        //right
        l = 0;
        
        while(i < c.length && c[i] == '-'){
            i++;
            l++;
        }
        TreeNode right = null;
        if(l <= level)  {
            i -= l;
            if(left != null) h.left = left;
            return h;
        }
        
        if(l > level){
            right = rec(c,level+1);
        }
        //add left right
        if(left != null) h.left = left;
        if(right != null) h.right = right;
        

        return h;
    }
    public TreeNode recoverFromPreorder(String t) {
        char[] c = t.toCharArray();
        return rec(c,0);
    }
}