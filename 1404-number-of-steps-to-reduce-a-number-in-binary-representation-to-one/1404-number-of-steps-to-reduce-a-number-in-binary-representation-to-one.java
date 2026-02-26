import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {

        BigInteger num = new BigInteger(s, 2);
        BigInteger one = BigInteger.ONE;
        BigInteger two = BigInteger.valueOf(2);

        int count = 0;

        while (!num.equals(one)) {

            if (num.mod(two).equals(BigInteger.ZERO)) {
                num = num.divide(two);
            } else {
                num = num.add(one);
            }

            count++;
        }

        return count;
    }
}