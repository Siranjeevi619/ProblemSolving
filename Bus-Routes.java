class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target)
            return 0;
        Map<Integer, List<Integer>> mpp = new HashMap<>();
        for (int busId = 0; busId < routes.length; busId++) {
            for (int stop : routes[busId]) {
                if (!mpp.containsKey(stop)) {
                    mpp.put(stop, new ArrayList<>());
                }
                mpp.get(stop).add(busId);
            }
        }
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> busTaken = new HashSet<>();
        Set<Integer> stopVisited = new HashSet<>();
        queue.offer(source);
        int res = 0;
        while (!queue.isEmpty()) {
            res += 1;
            int queueSize = queue.size();
            for (int i = 0; i < queueSize; i++) {
                int currentStop = queue.poll();
                for (int busId : mpp.getOrDefault(currentStop, new ArrayList<>())) {
                    if (busTaken.contains(busId)) {
                        continue;
                    }
                    busTaken.add(busId);
                    for(int nextStop : routes[busId]){
                        if(stopVisited.contains(nextStop)){
                            continue;
                        }
                        if(nextStop == target) return res;

                        queue.offer(nextStop);
                        stopVisited.add(nextStop);
                    }
                }
            }
        }
        return -1;
    }
}