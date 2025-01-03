//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String s[] = br.readLine().split(" ");
            int arr[] = new int[s.length];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            int k = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            System.out.println(obj.subarrayXor(arr, k));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
           HashMap<Integer, Integer> mpp = new HashMap<>();
        mpp.put(0,1);
        int sum = 0;
        int ans = 0;
        for(int i =  0 ; i<arr.length ; i+=1 ){
            sum ^= arr[i];
            // if(sum == k)
            int remains = sum ^ k;
            if(mpp.containsKey(remains)){
                ans += mpp.get(remains);
            }
            mpp.put(sum, mpp.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}