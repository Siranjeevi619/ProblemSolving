//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Number of test cases
        sc.nextLine();        // Consume the newline character

        while (t-- > 0) {
            String input = sc.nextLine();

            // Replace ][ with ],[
            input = input.replace("][", "],[");

            ArrayList<ArrayList<Integer>> mat = new ArrayList<>();
            String[] rows = input.split("],\\s*\\[");

            for (String row : rows) {
                row = row.replaceAll("[\\[\\]]", ""); // Remove any surrounding brackets
                ArrayList<Integer> intRow = new ArrayList<>();
                for (String num : row.split(",")) {
                    intRow.add(Integer.parseInt(num.trim()));
                }
                mat.add(intRow);
            }

            Solution obj = new Solution();
            int result = obj.rowWithMax1s(convertListToArray(mat));

            System.out.println(result);

            System.out.println("~");
        }
        sc.close();
    }

    // Helper method to convert ArrayList<ArrayList<Integer>> to 2D array
    public static int[][] convertListToArray(ArrayList<ArrayList<Integer>> mat) {
        int rows = mat.size();
        int cols = mat.get(0).size();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = mat.get(i).get(j);
            }
        }
        return arr;
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
     public int rowWithMax1s(int[][] arr) {
        if (arr == null || arr.length == 0 || arr[0].length == 0) {
            return -1; // Handle edge case for empty array
        }
        
        int rowCount = arr.length;
        int colCount = arr[0].length;
    
        int maxRow = -1;
        int maxCount = 0;
    
        for (int i = 0; i < rowCount; i++) {
            int count = calciRow(arr[i]); // Count 1s in the row
            if (count > maxCount) {
                maxCount = count;
                maxRow = i;
            }
        }
    
        return maxRow;
    }
    
    static int calciRow(int[] arr) {
        int count = 0;
        for (int val : arr) {
            count += val; 
        }
        return count;
    }

}