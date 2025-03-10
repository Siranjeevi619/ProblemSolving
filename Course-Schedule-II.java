class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0 ; i < numCourses ; i+=1){
            adj.add(new ArrayList<>());
        }
        for(int [] preq : prerequisites){
            int course  = preq[0];
            int pre = preq[1];
            adj.get(pre).add(course);
        }
        int [] indegree = new int[numCourses];
        int [] result = new int [numCourses];
        for(int i =  0 ; i < numCourses ; i+=1){
            for(int it: adj.get(i)){
                indegree[it]+=1;
            }
        }
        int idx = 0;
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0 ; i < numCourses ; i+=1){
            if(indegree[i] == 0){
                queue.offer(i);
            }
        }

        while(!queue.isEmpty()){
            int node = queue.poll();
            result[idx] = node;
            idx+=1;
            for(int i : adj.get(node)){
                indegree[i]-=1;
                if(indegree[i] == 0){
                    queue.offer(i);
                }
            }
        }
        return idx == numCourses ? result : new int [] {};

    }
}