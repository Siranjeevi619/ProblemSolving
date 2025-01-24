//{ Driver Code Starts
// Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        // Initialize BufferedReader for efficient input reading
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Read the number of test cases
        String str = br.readLine();
        int t = Integer.parseInt(str.trim());

        // Process each test case
        while (t-- > 0) {
            // Read the next line containing the array elements
            str = br.readLine();
            String[] tokens = str.trim().split("\\s+");

            // Convert the input strings to integers and store in an array
            ArrayList<Integer> list = new ArrayList<>();
            for (String token : tokens) {
                if (!token.isEmpty()) { // Ensure that the token is not empty
                    list.add(Integer.parseInt(token));
                }
            }

            // Convert ArrayList to int[] for processing
            int[] arr = list.stream().mapToInt(Integer::intValue).toArray();

            // Create an instance of Solution and compute the minimum energy
            Solution ob = new Solution();
            int result = ob.minCost(arr);

            // Output the result followed by a tilde as per the original C++ code
            System.out.println(result);
            System.out.println("~");
        }
    }
}


// } Driver Code Ends
// User function Template for Java
// import java.util.*;
class Solution {
    // static int energyCount(int [] stones, int index, int [] dp){
    //     if(index == 0){
    //         return 0;
    //     }
    //     if(dp[index] != -1){
    //         return dp[index];
    //     }
    //     int left =
    //     int right = Integer.MAX_VALUE;
    //     if(index > 1){
    //         right = 
    //     }
    //     return dp[index] =  Math.min(left, right);
    // }
    int minCost(int[] height) {
        // code here
        int n =  height.length;
        int [] dp = new int [n+1];
        for(int i = 0 ; i < n+1 ; i+=1){
            dp[i] = -1;
        }
        
        dp[0] = 0;
        
        // return energyCount(height, n-1,dp);
        for(int i = 1 ; i <n ; i+=1){
            int fs = dp[i -1 ]+ Math.abs(height[i] - height[i - 1]);
            int ss = Integer.MAX_VALUE;
            if(i > 1){
                ss = dp[i - 2] + Math.abs(height[i] - height[i- 2]);
            }
            
            dp[i] = Math.min(fs,ss);
        }
        return dp[n-1];
    }
}

//{ Driver Code Starts.

// } Driver Code Ends