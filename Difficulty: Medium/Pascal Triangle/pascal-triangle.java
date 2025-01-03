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

            ArrayList<Integer> ans = new Solution().nthRowOfPascalTriangle(n);
            printAns(ans);
        }
    }

    public static void printAns(ArrayList<Integer> ans) {
        for (Integer x : ans) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        
        for(int i  = 0 ; i< n ; i++){
            ArrayList<Integer> rows = new ArrayList<>();
            for(int j = 0 ; j <= i ; j +=1){
                if(j == 0 || j ==i ){
                    rows.add(1);
                }
                else{
                    ArrayList<Integer> previous = triangle.get(i-1);
                    rows.add(previous.get(j) + previous.get(j-1));
                }
            }
            triangle.add(rows);
        }
        return triangle.get(n-1);
        
    }
}