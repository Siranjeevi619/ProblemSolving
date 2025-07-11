class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minSteps = Integer.MAX_VALUE;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                found = true;
                int clockwise = (i - startIndex + n) % n;
                int counterClockwise = (startIndex - i + n) % n;
                int steps = Math.min(clockwise, counterClockwise);
                minSteps = Math.min(minSteps, steps);
            }
        }

        return found ? minSteps : -1;
    }
}
