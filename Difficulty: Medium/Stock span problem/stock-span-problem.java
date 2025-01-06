//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            v = new Solution().calculateSpan(arr);

            for (int i = 0; i < v.size(); i++) System.out.print(v.get(i) + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to calculate the span of stock's price for all n days.
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // write code here
        Stack <Integer> stack =  new Stack <> () ;
        ArrayList<Integer> result = new ArrayList<>();
        int arrSize = arr.length;
        for(int i = 0 ; i < arrSize ; i +=1){
            while(!stack.isEmpty() && arr[i] >= arr[stack.peek()]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result.add(i - stack.peek());
            }
            else{
                result.add(i+1);
            }
            stack.push(i);
            
        }
        return result;
    
    }
}