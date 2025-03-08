class Solution {
    static boolean dfs(int index, int [][]graph, boolean [] visited , boolean [] pathVisited, boolean [] check){
        visited[index] = true;
        pathVisited[index] = true;
        check[index] = false;
        for(int i : graph[index]){
            if(!visited[i]){
                if(dfs(i, graph, visited, pathVisited, check)){
                    return true;
                }
            }
            else if(pathVisited[i]){
                return true;
            }
        }
        check[index] = true;
        pathVisited[index] = false;
        return false;

    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int v = graph.length;
        boolean [] visited = new boolean [v];
        boolean [] pathVisited = new boolean [v];
        boolean [] check = new boolean[v];
        for(int i = 0 ; i <  v ; i+=1){
            if(!visited[i]){
                dfs(i,graph, visited, pathVisited, check);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0 ; i < v ; i+=1){
            if(check[i]){
                result.add(i);
            }
        }
        return result;
    }
}