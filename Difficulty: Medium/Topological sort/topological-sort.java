//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            int vertices = Integer.parseInt(read.readLine());
            int edges = Integer.parseInt(read.readLine());

            for (int i = 0; i < vertices; i++) adj.add(i, new ArrayList<Integer>());

            int p = 0;
            for (int i = 1; i <= edges; i++) {
                String s[] = read.readLine().trim().split("\\s+");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
            }

            ArrayList<Integer> res = new Solution().topologicalSort(adj);

            if (check(adj, vertices, res) == true)
                System.out.println("1");
            else
                System.out.println("0");
            System.out.println("~");
        }
    }

    static boolean check(ArrayList<ArrayList<Integer>> adj, int V,
                         ArrayList<Integer> res) {

        if (V != res.size()) return false;

        int[] map = new int[V];
        for (int i = 0; i < V; i++) {
            map[res.get(i)] = i;
        }
        for (int i = 0; i < V; i++) {
            for (int v : adj.get(i)) {
                if (map[i] > map[v]) return false;
            }
        }
        return true;
    }
}

// } Driver Code Ends



class Solution {
    // Function to return list containing vertices in Topological order.
    static void dfs(int index ,boolean [] visited, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st ){
        visited[index] = true;
        for(int i : adj.get(index)){
            if(!visited[i]){
                dfs(i, visited, adj, st);
               
            }
        }
         st.push(index);
        
    }
    static ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        // Your code here
        int v = adj.size();
        Stack<Integer> st = new Stack<>();
        boolean [] visited = new boolean [v];
        for(int i = 0 ; i < v ; i+=1){
            if(!visited[i]){
                dfs(i, visited, adj, st);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        
        while(!st.isEmpty()){
            result.add(st.pop());
        }
        return result;
    }
}