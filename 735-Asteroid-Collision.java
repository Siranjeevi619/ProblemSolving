class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        ArrayList<Integer> stack = new ArrayList<>();
        for (int i = 0; i < asteroids.length; i += 1) {
            if (asteroids[i] > 0) {
                stack.add(asteroids[i]);
            } else {
                while (!stack.isEmpty() && stack.get(stack.size() - 1) > 0
                        && stack.get(stack.size() - 1) < Math.abs(asteroids[i])) {
                    stack.remove(stack.size() - 1);
                }
                if (!stack.isEmpty() && stack.get(stack.size() - 1) == Math.abs(asteroids[i])) {
                    stack.remove(stack.size() - 1);
                } else if (stack.isEmpty() || stack.get(stack.size() - 1) < 0) {
                    stack.add(asteroids[i]);
                }
            }
        }
        int[] result = new int[stack.size()];
        int i = 0;
        for (int j : stack) {
            result[i] = j;
            i += 1;
        }
        return result;
    }
}