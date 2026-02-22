class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ls = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bot = matrix.length - 1;
        while (top <= bot && left <= right) {
            for (int j = left; j <= right; j += 1) {
                ls.add(matrix[top][j]);
            }
            top += 1;
            for (int j = top; j <= bot; j += 1) {
                ls.add(matrix[j][right]);
            }
            right -= 1;
            if (top <= bot) {
                for (int j = right; j >= left; j -= 1) {
                    ls.add(matrix[bot][j]);
                }
                bot -= 1;
            }
            if (left <= right) {
                for (int j = bot; j >= top; j -= 1) {
                    ls.add(matrix[j][left]);
                }
                left += 1;
            }
        }
        return ls;
    }
}