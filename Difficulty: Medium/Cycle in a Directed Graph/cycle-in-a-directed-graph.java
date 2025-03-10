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
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
            Queue<Integer> queue = new LinkedList<>();
    int [] indegree = new int[n];
    for(int i = 0 ; i < n ; i+=1){
      for(int it : adj.get(i)){
        indegree[it]++;
      }
    }
    for(int i = 0 ; i < n ; i+=1){
      if(indegree[i] == 0){
        queue.offer(i);
      }

    }
    int count = 0;

    while(!queue.isEmpty()){
      int node = queue.poll();
      count +=1;
      for(int i : adj.get(node)){
        indegree[i]--;
        if(indegree[i] == 0){
          queue.offer(i);
        }
      }
    }
    return !(count == n);
    }
}