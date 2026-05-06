class Solution:
    def rotateTheBox(self, grid: List[List[str]]) -> List[List[str]]:
        rows, cols = len(grid), len(grid[0])
        res = [['.'] * rows for _ in range(cols)]

        for r in range(rows):
            p = cols - 1
            for c in range(cols - 1, -1, -1):
                if grid[r][c] == '*':
                    res[c][rows - 1 - r] = '*'
                    p = c - 1
                elif grid[r][c] == '#':
                    res[p][rows - 1 - r] = '#'
                    p -= 1

        return res