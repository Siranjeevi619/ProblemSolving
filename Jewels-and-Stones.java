class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> mpp = new HashMap<>();
        for (char ch : stones.toCharArray()) {
         
            mpp.put(ch, mpp.getOrDefault(ch, 0) + 1);
        }
        int count = 0;
        for (char ch : jewels.toCharArray()) {
           
            if (mpp.containsKey(ch)) {
                System.out.print(mpp.get(ch)+" ");

                count += mpp.get(ch);
            }
        }
        return count;
    }
}