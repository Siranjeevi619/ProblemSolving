class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int timeSize = startTime.length;
        int count=0;
        for(int i = 0 ; i < timeSize;i+=1){
            if(startTime[i] <= endTime[i] && startTime[i] <= queryTime && endTime[i] >= queryTime){
                count+=1;
            }
        }
        return count;
    }
}