class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");

        Map<String, Integer> mpp = new HashMap<>();
        for (String str : words) {
            mpp.put(str, mpp.getOrDefault(str, 0) + 1);
        }

        PriorityQueue<Map.Entry<String, Integer>> pq =
            new PriorityQueue<>(new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                    return b.getValue() - a.getValue(); 
                }
            });

        pq.addAll(mpp.entrySet());

        Set<String> bannedSet = new HashSet<>();
        for (String ban : banned) {
            bannedSet.add(ban);
        }

        while (!pq.isEmpty()) {
            Map.Entry<String, Integer> entry = pq.poll();
            if (!bannedSet.contains(entry.getKey())) {
                return entry.getKey();
            }
        }

        return ""; 
    }
}
