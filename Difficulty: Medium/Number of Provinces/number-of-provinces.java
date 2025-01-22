//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int V = Integer.parseInt(read.readLine());
            
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            
            for(int i=0; i<V; i++)
            {
                String S[] = read.readLine().split(" ");
                ArrayList<Integer> temp = new ArrayList<>();
                for(int j=0; j<V; j++)
                    temp.add(Integer.parseInt(S[j]));
                adj.add(temp);
            }

            Solution ob = new Solution();
            System.out.println(ob.numProvinces(adj,V));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean [] visited,int node ){
        visited[node] = true;
        for(int i :adj.get(node)){
            if(visited[i] == false){
                dfs(adj,visited, i);
            }
        }

    }
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        // code here
        ArrayList<ArrayList<Integer>> adjLs = new ArrayList<>();
          for (int i = 0; i < V; i++) {
            adjLs.add(new ArrayList<>()); 
        }
        for(int i = 0 ; i < V ; i+=1){
            for(int j = 0 ; j < V ; j +=1){
                if(adj.get(i).get(j) == 1  && i != j){
                    adjLs.get(i).add(j);
                    adjLs.get(j).add(i);
                }
            }
        }
        int count = 0; 
        boolean [] visited = new boolean[V];
        for(int i = 0 ; i < V ; i+=1){
            if(visited[i] == false){
                count +=1;
                dfs(adjLs, visited, i);
            }
        }
        
        return count;
    }
};