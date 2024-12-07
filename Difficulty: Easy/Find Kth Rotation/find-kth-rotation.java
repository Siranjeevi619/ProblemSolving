//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input1 = sc.nextLine();
            Scanner ss1 = new Scanner(input1);
            while (ss1.hasNextInt()) {
                arr.add(ss1.nextInt());
            }
            Solution ob = new Solution();
            int res = ob.findKRotation(arr);
            System.out.println(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        
        int result = -1;
        int arrSize = arr.size();
        // for(int i = 0;i<arrSize-1; i++){
        //     if(arr.get(i) > arr.get(i+1)){
        //         result+=1;
        //     }
        // }
        // return result;
        int currentMax = Integer.MAX_VALUE;
        for(int i = 0;i<arrSize ; i++){
            if(currentMax > arr.get(i)){
                currentMax = arr.get(i);
                result = i;
            }
        }
        return result;
        
    }
}