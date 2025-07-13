class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int i = 0 , j = 0;
        int count = 0;
        while(i < players.length && j < trainers.length){
            if(players[i] <= trainers[j]){
                count+=1;
                i+=1;
                j+=1;
            }
            else{
                j+=1;
            }
        }
        return count;

    }
}