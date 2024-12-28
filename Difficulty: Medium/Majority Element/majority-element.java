//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Geeks {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().majorityElement(arr));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int majorityElement(int arr[]) {
        // your code here
        int vote= 0;
        int people = -1;
        int arrSize = arr.length;
        for(int i = 0 ; i < arrSize ; i ++){
            if(vote == 0){
                people = arr[i];
                vote = 1;
            }
            else if(people == arr[i]){
                vote +=1;
            }
            else{
                vote -=1;
            }
        }
        // return people;
        vote = 0;
        for(int i : arr){
            if(people==i){
                vote +=1;
            }
        }
        
        if(vote >  arrSize / 2){
            return people;
        }
        return -1;
        
        
    }
}