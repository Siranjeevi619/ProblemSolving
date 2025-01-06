//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N;
            N = sc.nextInt();

            int[] asteroids = new int[N];
            for (int i = 0; i < N; i++) asteroids[i] = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.asteroidCollision(N, asteroids);

            for (int e : res) System.out.print(e + " ");
            System.out.println();
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int[] asteroidCollision(int N, int[] asteroids) {
        // code here
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i< N ; i +=1){
          if(asteroids[i] > 0){
              result.add(asteroids[i]);
          }
          else{
                while(!result.isEmpty() && result.get(result.size() - 1) > 0 && Math.abs(asteroids[i]) > result.get(result.size() -1)){
                result.remove(result.size()-1);
            }
            if( ! result.isEmpty() && result.get(result.size() -1)  == Math.abs(asteroids[i])  ){
                result.remove(result.size() -1);
            }
            else if(result.isEmpty() || result.get(result.size() -1) < 0){
                result.add(asteroids[i]);
            }
            // else
          }
        }
        int element  = 0;
        int [] stack = new int[result.size()];
        for(int i : result){
            stack[element] = i;
            element +=1;
        }
        return stack;
    }
}
