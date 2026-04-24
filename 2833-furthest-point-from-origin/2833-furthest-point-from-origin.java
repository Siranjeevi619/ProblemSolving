class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int numOfDash = 0;
        int originFarAway = 0;

        System.out.println();
        for (char ch : moves.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'L') {
                    originFarAway += 1;
                } else {
                    originFarAway -= 1;
                }
            } else {
                numOfDash += 1;
            }
        }
        return Math.max(Math.abs(originFarAway + numOfDash), Math.abs(originFarAway - numOfDash));
    }
}