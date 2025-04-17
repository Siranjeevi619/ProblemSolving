class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gSize = g.length;
        int sSize = s.length;
        int i = 0, j =0;
        while(gSize > i && sSize > j){
            if(g[i]  <= s[j]){
                i+=1;
            }
            j+=1;
        }
        return i;
    }
}

// class Solution {
//     public int findContentChildren(int[] g, int[] s) {
//         Arrays.sort(g);
//         Arrays.sort(s);
//         int i = 0, j = 0;
        
//         while (i < g.length && j < s.length) {
//             if (g[i] <= s[j]) {
//                 i++;
//             }
//             j++;
//         }
        
//         return i;
//     }
// }
