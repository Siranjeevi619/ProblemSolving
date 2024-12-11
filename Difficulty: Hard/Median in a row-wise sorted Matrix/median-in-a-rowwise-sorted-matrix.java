//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int R = Integer.parseInt(read.readLine());
            int C = Integer.parseInt(read.readLine());
            int matrix[][] = new int[R][C];
            int c = 0;
            for (int i = 0; i < R; i++) {
                String line[] = read.readLine().trim().split(" ");
                for (int j = 0; j < C; j++) {
                    matrix[i][j] = Integer.parseInt(line[j]);
                }
            }
            Solution ob = new Solution();
            int ans = ob.median(matrix);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int median(int mat[][]) {
        // code hereA
        int rowSize = mat.length;
        int colSize = mat[0].length;
        int [] arr = new int[rowSize * colSize];
        
        int k = 0;
        for(int i=0;i<rowSize;i++){
            for(int j = 0;j<colSize;j++){
                arr[k] = mat[i][j];
                k++;
            }
        }
        
        Arrays.sort(arr);
        int totalSize = rowSize * colSize;
        return arr[totalSize / 2];
        
        // List<Integer> result = new ArrayList<>();
        // for(int i = 0;i<rowSize ;i++){
        //     for(int j = 0;j<colSize;j++){
        //         result.add(mat[i][j]);
        //     }
        // }
        // Collections.sort(result);
        // return result.get((rowSize * colSize) / 2);
    }
    
}