class Solution {
    static int find(int n){
        int res = 0;
        while(n > 0){
            int rem = n % 10;
            res = res +rem;
            n/=10;
        }
        return res;
    }
    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for(int i = 1; i <= n ; i+=1){
            int value = find(i);
            mpp.put(value,mpp.getOrDefault(value, 0)+1 );
            max = Math.max(max, mpp.get(value));

        }
        int counter = 0;
        for(int value : mpp.values()){
            if(value == max) counter++;
        }
        return counter;
    }
}