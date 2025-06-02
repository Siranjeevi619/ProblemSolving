class Solution {
    public int distributeCandies(int[] candyType) {
        int typeSize = candyType.length;
        Set<Integer> set = new HashSet<>();
        int adviseSize=  typeSize / 2;
        // System.out.println(a)
        for (int i : candyType) {
            if(set.size() == adviseSize){
                return set.size();
            }
            set.add(i);
        }
        return set.size();
    }
}