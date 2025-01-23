//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends

class Node {
    int first;
    int second;
    public Node(int first, int second) {
        this.first = first;
        this.second = second; 
    }
}
class Solution {
    
    static boolean bfs(int i  , boolean[] visited,ArrayList<ArrayList<Integer>> adj ){
        visited[i] = true;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(i,-1 ));
        while(!queue.isEmpty()){
            Node current = queue.poll();
            int child = current.first;
            int parent = current.second;
            for(int id : adj.get(child)){
                if(visited[id] == false){
                    visited[id] = true;
                    queue.offer(new Node(id, child));
                }
                else if(parent != id){
                    return true;
                }
            }
        }
        return false;
        
    }
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int V = adj.size();
            boolean [] visited = new boolean[V];
            for(int i = 0 ; i < V ; i+=1){
                if(!visited[i]){
                    if(bfs(i, visited, adj)){
                        return true;
                    }
                }
            }
            return false;
    }
}