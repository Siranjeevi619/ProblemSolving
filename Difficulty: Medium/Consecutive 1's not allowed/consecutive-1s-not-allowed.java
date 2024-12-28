//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            int ans = new Solution().countStrings(n);

            System.out.println(ans);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int countStrings(int n) {
        // code here
        int bs0 = 1;
        int bs1 = 1;
        for(int i = 2 ; i <= n ; i ++){
            int cbs0 = (bs0 + bs1);
            int cbs1 = bs0;
            bs0= cbs0;
            bs1 = cbs1;
        }
        return bs0 + bs1;
    }
}