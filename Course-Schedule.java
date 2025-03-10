class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int [] indegree = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj  = new ArrayList<>();
        for(int i = 0 ; i < numCourses ; i+=1){
            adj.add(new ArrayList<>());
        }
        for(int [] pre :prerequisites ){
            int a = pre[0];
            int b = pre[1];
            adj.get(b).add(a);
            indegree[a]++;
        }
      
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses;i+=1){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }
        int count = 0;
        while(!queue.isEmpty()){
            int node = queue.poll();
            count +=1;
            for(int it : adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    queue.offer(it);
                }
            }
        }
        return (count == numCourses);
    }
}