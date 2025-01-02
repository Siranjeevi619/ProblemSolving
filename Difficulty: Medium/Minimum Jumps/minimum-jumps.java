//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
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

            System.out.println(new Solution().minJumps(arr));
            // System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    static int minJumps(int[] nums) {
        // code here
        // int jumps = -1;
        // int l = 0, r = 0;
        // int arrSize = arr.length;
        // while(r < arrSize - 1){
        //     int far = 0;
        //     for(int i = l ; i <=r ; i +=1){
        //         far = Math.max(i+arr[i], far);
        //     }
        //     l = r + 1;
        //     r = far;
        //     jumps += 1;
        // }
        // return jumps;
        int jumps  = 0;
        int current = 0;
        int max = 0;
        int numsSize = nums.length;
        while(max < numsSize - 1){
            int far = 0;
            if(current > max){
                return -1;
            }
            // far = Math.max(far, nums[i])
            for(int i = current; i<= max ; i +=1){
                far = Math.max(i + nums[i], far);
            }
            current = max  + 1;
            max = far;
            jumps+=1;
        }
        return jumps;
    }
}