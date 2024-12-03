//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases
        for (int g = 0; g < t; g++) {
            // Read input array as a string, split by space, and convert to integers
            String[] str = br.readLine().trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }
            // Print the result from maxLen function
            System.out.println(new Solution().maxLen(arr));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    int maxLen(int arr[]) {
        // code here
        // int count = 0;
    //     int max = 0;
    //     int arrSize = arr.length;
    //     for(int i=0;i<arrSize;i++){
    //         int count = 0;
    //         for(int j = i;j<arrSize;j++){
    //             count += arr[j];
    //           if(count == 0){
				// // max = Math.max(max, j-i+1);
				// if( max > j-i+1){
				//     max = max;
				// }
    // 				else{
    // 				    max = j - i+1;
    // 				}
			 //   }
    //         }
    //     }
    //     return max;
    
    
      int max = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(0, -1);

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i]; 

            if (map.containsKey(prefixSum)) {
                int subarrayLen = i - map.get(prefixSum);
                max = Math.max(max, subarrayLen);
            } else {
                map.put(prefixSum, i);
            }
        }

        return max;
    }
}