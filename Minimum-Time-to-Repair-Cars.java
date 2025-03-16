class Solution {
    public long repairCars(int[] ranks, int cars) {
        long left = 1 , right =(long) 1000000e9;
        while(left < right ){
            long mid = (left + right) / 2;
            if(check(ranks, cars, mid)){
                right= mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }
    static boolean check(int [] ranks, int cars, long time)
    {
        long repairedCar = 0;
        for(int i : ranks){
            repairedCar += Math.sqrt(time/ i);

        }
        return repairedCar >= cars;
    }
}