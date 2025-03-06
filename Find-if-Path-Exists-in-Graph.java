class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>()); 
        }
        for(int i = 0 ; i < edges.length ; i +=1 ){
            int v = edges[i][0];
            int u = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        Queue<Integer> queue = new LinkedList<>();
        boolean [] visited = new boolean[n];
        queue.offer(source);
        visited[source] = true;
        while(!queue.isEmpty()){
            int curr = queue.poll();
            if(destination == curr){
                return true;
            }
            for(int i : adjList.get(curr)){
              if(visited[i] == false){
                  visited[i] = true;
                queue.offer(i);
              }

            }
        }
        return false;
    }
}