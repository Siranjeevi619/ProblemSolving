//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int V = sc.nextInt();
            int E = sc.nextInt();
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u); // Since the graph is undirected
            }

            int src = sc.nextInt();

            Solution obj = new Solution();
            int[] res = obj.shortestPath(adj, src);

            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    // Function to find the shortest path from a source node to all other nodes
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adjLs, int src) {
        // code here
        int v = adjLs.size();
        // ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
        // for(int i = 0 ; i < v; i +=1){
        //     adjLs.add(new ArrayList<>());
        // }
        
        // for(int i = 0 ; i < v ; i+=1){
        //     adjLs.get(adj.get(i).get(0)).add(adj.get(i).get(1));
        //     adjLs.get(adj.get(i).get(1)).add(adj.get(i).get(0));
        // }
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(src);
        int [] dist = new int[v];
        for(int i = 0 ; i < v ;  i+=1){
            dist[i] = (int)1e9;
        }
        dist[src] = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            for(int neighbor  : adjLs.get(node)){
                if (dist[node] + 1 < dist[neighbor]) { 
                    dist[neighbor] = dist[node] + 1;
                    queue.offer(neighbor);
                }
            }
            
        }
        
        for(int i = 0 ; i < v ; i+=1){
            if(dist[i] ==(int) 1e9){
                dist[i] = -1;
            }
        }
        return dist;
        
    }
    
}
