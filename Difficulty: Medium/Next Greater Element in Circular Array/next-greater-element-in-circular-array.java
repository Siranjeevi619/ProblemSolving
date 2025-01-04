//{ Driver Code Starts
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter ot = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    int n = Integer.parseInt(br.readLine().trim());
		    String inputLine[] = br.readLine().trim().split(" ");
		    long[] arr = new long[n];
		    for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
		    Solution ob = new Solution();
		    long[] res = ob.nextLargerElement(arr, n);
		    for (int i = 0; i < n; i++) 
		        ot.print(res[i] + " ");
		    ot.println();
		}
        ot.close();
	}
}



// } Driver Code Ends


// User Function Template for JAVA

class Solution{
    public static long[] nextLargerElement(long[] arr, int n) { 
        // Your code here
        int arrSize  = arr.length;
        Stack <Long> stack = new Stack<>();
        long [] result = new long[arrSize];
        for(int i = 2 * arrSize - 1 ; i >= 0 ; i-=1){
            
            while(!stack.isEmpty() && stack.peek() <= arr[i % arrSize]){
                stack.pop();
            }
            
            if(i < arrSize){
                result[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(arr[i% arrSize]);
        }
        return result;
    } 
}