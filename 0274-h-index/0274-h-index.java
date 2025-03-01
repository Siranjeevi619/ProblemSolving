class Solution {
    public int hIndex(int[] citations) {
        int size = citations.length;
        Arrays.sort(citations);

        for(int i = 0 ; i < size ; i+=1){
            if(citations[i] >= size-i ){
                return size -i;
            }
        }
        return 0;
    }
}