class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int hourLength = hours.length;
        int count = 0;
        for(int i = 0 ; i < hourLength; i++){
            if(hours[i] >= target){
                count  +=1;
            }
        }
        return count;
    }
}