class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int valuesSize = values.length;
        int max = values[0];

        int currentValue = 0;
        for(int i = 1 ; i< valuesSize; i++){
            // if(values[i] + values)
            // currentValue += values[i] + values[i+1] + i - (i+1);
            // max = Math.max(currentValue, max);

            currentValue = Math.max(currentValue, max + values[i] - i);
            max = Math.max(max, values[i] + i);
        }
        return currentValue;
    }
}