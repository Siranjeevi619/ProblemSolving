class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (s.length() < p.length()) return res;

        char[] ps = p.toCharArray();
        Arrays.sort(ps);
        int k = ps.length;

        for (int i = 0; i <= s.length() - k; i++) {
            String curr = s.substring(i, i + k);
            char[] win = curr.toCharArray();
            Arrays.sort(win);
            if (Arrays.equals(win, ps)) {
                res.add(i);
            }
        }

        return res;
    }
}
