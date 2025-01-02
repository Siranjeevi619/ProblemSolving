//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);

            // Ensure input is read correctly
            inputLine = br.readLine().trim().split(" ");
            if (inputLine == null || inputLine.length == 0) {
                System.out.println("Invalid input");
                continue;
            }

            int[] arr = new int[inputLine.length];
            for (int i = 0; i < inputLine.length; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, k);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int k) {
        // // code here
        // int index = 0;
        // if(index  == arr.length){
        //     return 0;
        // }
        Arrays.sort(arr);
        int small = arr[0] + k;
        int arrSize = arr.length;
        int large = arr[arrSize - 1] - k;
        int result = arr[arrSize -1 ] - arr[0];
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        for(int i = 1 ; i < arrSize ; i+=1){
            min = Math.min(small, arr[i] - k);
            max = Math.max(large, arr[i-1] + k);
            if(min < 0){
                continue;
            }
            result = Math.min(result, max- min);
        }
        return result;
        
        
    }
}
