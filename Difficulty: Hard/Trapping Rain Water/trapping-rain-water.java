//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().trappingWater(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int trappingWater(int arr[]) {
        // code here
        int left = 0;
        int waterContains = 0;
        int arrSize = arr.length;
        int right = arrSize - 1;
        int leftMax = 0, rightMax = 0;
        while(left < right){
            if(arr [left] <= arr[right]){
                if(arr[left] > leftMax ){
                    leftMax = arr[left];
                }
                else{
                    waterContains += leftMax - arr[left];
                
                }
                left+=1;
            }
            else{
                // if(arr[])
                if(arr[right] > rightMax){
                    rightMax = arr[right];
                }
                else{
                    waterContains += rightMax - arr[right];
                }
                right-=1;
            }
        }
        return waterContains;
    }
}
