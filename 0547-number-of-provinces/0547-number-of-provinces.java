class Solution {
    static void dfs(ArrayList<ArrayList<Integer>> adj, boolean [] visited,int node ){
        visited[node] = true;
        for(int i :adj.get(node)){
            if(visited[i] == false){
                dfs(adj,visited, i);
            }
        }

    }
    public int findCircleNum(int[][] isConnected) {
        int isConnectedLength = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < isConnectedLength ; i+=1){
            adj.add(new ArrayList<>());
        }

        for(int i = 0 ; i < isConnectedLength; i += 1){
            for(int j = 0 ; j < isConnectedLength ; j+=1){
                if(isConnected[i][j] == 1 && i != j){
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }

        // ArrayList<Integer> ls = new ArrayList<>();
        int count = 0;
        boolean [] visited = new boolean[isConnectedLength];
        for(int i = 0 ; i< isConnectedLength ; i+=1){
            if(visited[i] == false){
                count+=1;
                dfs(adj, visited, i);
            }
        }
        return count;


    }
}