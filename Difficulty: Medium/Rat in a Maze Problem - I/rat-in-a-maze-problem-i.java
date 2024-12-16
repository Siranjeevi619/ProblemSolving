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
            ArrayList<String> result = obj.findPath(mat);

            if (result.isEmpty()) {
                System.out.println("[]");
            } else {
                for (String res : result) {
                    System.out.print(res + " ");
                }
                System.out.println();
            }
            System.out.println("~");
        }
        sc.close();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find all possible paths
    static void helper(ArrayList<ArrayList<Integer>> board, int row, int col, String sb, ArrayList<String> result){
        
        // if( )''
        int boardSize = board.size();
        
        if(row > boardSize - 1 ||  col > boardSize - 1 || col < 0 || row < 0 || board.get(row).get(col) == 0){
            // result.add
            return ;
        }
        
        
        if(row  == boardSize - 1 && col == boardSize - 1) {
            result.add(sb);
            return ;
        }
        
        board.get(row).set(col, 0);
        helper(board, row-1, col, sb+"U", result);
        helper(board, row,col-1, sb+"L",  result);
        helper(board, row, col+1, sb+"R",  result);
        helper(board, row+1, col, sb+"D",  result);
        board.get(row).set(col, 1);
    
        
    }
    
    
    
    public ArrayList<String> findPath(ArrayList<ArrayList<Integer>> mat) {
        // code here\\\
        
        ArrayList<String> result = new ArrayList<>();
        String sb = "";
        helper(mat, 0, 0, sb , result);
        Collections.sort(result);
        return result;
    }
}