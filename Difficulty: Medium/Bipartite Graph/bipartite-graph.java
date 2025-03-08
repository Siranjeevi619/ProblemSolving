//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            S = br.readLine().trim().split(" ");
            int E = Integer.parseInt(S[0]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < E; i++) {
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(adj);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    static boolean isBipartite(int start , int v  , ArrayList<ArrayList<Integer>> adj, int [] visited){
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int i : adj.get(node)){
                if( visited[i] == -1){
                    visited[i] = 1 - visited[node] ;
                    queue.offer(i);
                }
                else if(visited[node] == visited[i]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isBipartite(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int v = adj.size();
        int [] visited = new int[v];
        for(int i = 0 ; i < v ; i+=1){
            visited[i]  = -1;
        }
        for(int i = 1   ; i < v ; i+=1){
            if(visited[i] == -1){
               if(isBipartite(i, v, adj, visited) == false){
                   return false;
               }
            }
        }
        return true;
    }
}