class Solution {
    public String clearStars(String s) {
        int[] characters = new int[26];
        int strSize = s.length();
        PriorityQueue <int []> pq = new PriorityQueue<>((a, b) -> {
            if(a[0] != b[0]) return a[0] - b[0];
            return a[1] - b[1]; 
        });
        boolean [] deleted = new boolean[strSize];
        for (int i = 0; i < strSize; i += 1) {
            char ch = s.charAt(i);
            if(ch == '*'){
                int [] top = pq.poll();
                deleted[-top[1]] =true;
            }
            else{
                pq.offer(new int[]{ch , -i});
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i = 0 ; i < strSize ; i++){
            if(deleted[i] || s.charAt(i) == '*') continue;
            res.append(s.charAt(i));
        }
        return new String(res);

    }
}