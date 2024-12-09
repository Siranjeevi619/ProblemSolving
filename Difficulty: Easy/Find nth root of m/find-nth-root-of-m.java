//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int m = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthRoot(n, m);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    
    static int findPower(int a, int b){
        // return (int) Math.pow(a, b);
        long powerValue = 1;
        for(int i = 1;i<=b;i++){
            powerValue *=a;
        }
        return (int) powerValue;
    }
    
     public static int nthRoot(int n, int m) {
        // code here
        int low = 1;
        int high = m;
        while(low <= high){
            int mid = low + (high - low) / 2;
            int rootValue = findPower(mid, n);
            if( rootValue == m){
                return mid;
            }
            else if (rootValue > m){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        
        return -1;
    }
}