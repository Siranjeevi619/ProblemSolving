//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            String[] str =
                (br.readLine()).trim().split(" "); // Reading input as a string array
            int arr[] = new int[str.length]; // Creating integer array from the input
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            // Getting the result from the Solution class
            ArrayList<Integer> result = new Solution().subsetSums(arr);
            Collections.sort(result);
            // Printing the result in space-separated format
            for (int i = 0; i < result.size(); i++) {
                if (i != 0) System.out.print(" ");
                System.out.print(result.get(i));
            }
            System.out.println();    // Print new line after each test case
            System.out.println("~"); // Print new line after each test case
        }
    }
}

// } Driver Code Ends


// User function Template for Java//User function Template for Java
class Solution {
    static void findSubset(int ind, int sum ,int [] arr, int arrSize, ArrayList<Integer> result  ){
        if(ind == arrSize){
            result.add(sum);
            return ;
        }
        findSubset(ind+1, sum + arr[ind] , arr, arrSize, result);
        findSubset(ind+1, sum , arr, arrSize , result);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        int arrSize = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        findSubset(0, 0, arr, arrSize, result);
        return  result;
        
    }
}