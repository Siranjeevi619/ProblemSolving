//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int V = sc.nextInt();
            int E = sc.nextInt();
            for (int i = 0; i < V; i++) list.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                list.get(u).add(v);
            }
            if (new Solution().isCyclic(list) == true)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*Complete the function below*/

class Solution {
    static boolean dfs(int index, ArrayList<ArrayList<Integer>> adj, boolean[] visited, boolean[] pathVisited) {
    visited[index] = true;
    pathVisited[index] = true;

    for (int i : adj.get(index)) {
        if (!visited[i]) {
            if (dfs(i, adj, visited, pathVisited)) {
                return true;
            }
        }
        else if (pathVisited[i]) {
            return true;
        }
    }

    pathVisited[index] = false;
    return false;
}

public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
    int v = adj.size();
    boolean[] visited = new boolean[v];
    boolean[] pathVisited = new boolean[v];

    // Iterate through all nodes in the graph
    for (int i = 0; i < v; i++) {
        // If the node is not visited yet
        if (!visited[i]) {
            if (dfs(i, adj, visited, pathVisited)) {
                return true; // Cycle found
            }
        }
    }
    return false; 
}

}