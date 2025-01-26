//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {

        // taking input using Scanner class
        Scanner sc = new Scanner(System.in);

        // taking total testcases
        int t = sc.nextInt();

        while (t-- > 0) {

            // taking count of stairs
            int m = sc.nextInt();

            // creating an object of class DynamicProgramming
            Solution obj = new Solution();

            // calling method countWays() of class
            // DynamicProgramming
            System.out.println(obj.countWays(m));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static int find(int n, int [] dp){
        if(n == 0 || n == 1){
            return 1;
        }
        if(dp[n]!= -1){
            return dp[n];
        }
        int left = find(n-1, dp);
        int right = find(n -2, dp );
        dp[n] = left + right;
        return dp[n];
    }
    // Function to count number of ways to reach the nth stair.
    int countWays(int n) {

        // your code here
        int [] dp = new int[n+1];
        for(int i  =0 ; i <= n ; i+=1){
            dp[i] = -1;
        }
        return find(n, dp);
    }
}
