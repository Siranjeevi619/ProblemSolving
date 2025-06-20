class Solution {
    public boolean judgeCircle(String moves) {
        int xAxis = 0,yAxis = 0;
        for(char ch : moves.toCharArray()){
            if(ch == 'U'){
                xAxis++;
            }
            else if(ch == 'D'){
                xAxis-=1;
            }
            else if(ch == 'L'){
                yAxis -=1;
            }
            else if(ch == 'R'){
                yAxis +=1;
            }
        }
        return yAxis == 0 && xAxis == 0;
    }
}