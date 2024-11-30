//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[] arr = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Solution ob = new Solution();
            int[] ans = ob.getFloorAndCeil(x, arr);
            System.out.println(ans[0] + " " + ans[1]);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        int[] result = new int[2];

        int floor = Integer.MIN_VALUE;
        int arrSize = arr.length;
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] <= x && arr[i] > floor) {
                floor = arr[i];
            }
        }

        int ceil = Integer.MAX_VALUE;
        for (int i = 0; i < arrSize; i++) {
            if (arr[i] >= x && arr[i] < ceil) {
                ceil = arr[i];
            }
        }
        result[0] = (floor == Integer.MIN_VALUE) ? -1 : floor;
        result[1] = (ceil == Integer.MAX_VALUE) ? -1 : ceil;

        return result;
    }
}
