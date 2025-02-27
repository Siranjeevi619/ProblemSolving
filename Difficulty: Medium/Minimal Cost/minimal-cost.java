//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function Template for Java

class Solution {
    static int f(int index, int [] dp, int [] arr, int k){
        if(index == 0){
            return 0;
        }
        if(dp[index] != -1 ){
            return dp[index];
        }
        int mm = Integer.MAX_VALUE;
        for(int j = 1 ; j <= k ; j+=1){
           if(index - j >= 0){
                int curr = f(index - j , dp, arr, k) + Math.abs(arr[index] - arr[index- j]);
            mm = Math.min(mm, curr);
           }
        }
        return dp[index] = mm;
    }
    public int minimizeCost(int k, int arr[]) {
        // code here
        int n = arr.length;
        int [] dp = new int[n];
        for(int i = 0 ; i < n ; i+=1){
            dp[i] = -1;
        }
        return f(n-1, dp, arr, k);
        
    }
}



//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.minimizeCost(k, arr);

            System.out.println(res);

            System.out.println("~");
        }
    }
}
// } Driver Code Ends