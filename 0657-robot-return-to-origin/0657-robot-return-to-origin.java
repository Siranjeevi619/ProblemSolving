class Solution {
    public boolean judgeCircle(String moves) {
        int countX = 0;
                int countY = 0;

        for(char ch : moves.toCharArray()){
            if(ch == 'U'){
                countY+=1;
            }
            else if(ch == 'D'){
                countY-=1;
            }
            else if(ch == 'L'){
                countX+=1;
            }
            else if(ch == 'R'){
                countX-=1;
            }
        }
        return countX == 0 & countY == 0;
    }
}