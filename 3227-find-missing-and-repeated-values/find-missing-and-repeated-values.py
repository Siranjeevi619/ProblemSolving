class Solution:
    def findMissingAndRepeatedValues(self, grid: List[List[int]]) -> List[int]:
        missing_num = -1
        repeated = -1
        seen = set()
        missing = set()
        for i in range(len(grid)):
            for j in range(len(grid[0])):
                if grid[i][j] in seen:
                    repeated = grid[i][j]
                    
                seen.add(grid[i][j])
                missing.add(grid[i][j])
        missing = sorted(missing)
        print(missing)
        for i in range(1, len(missing)+1):
            if i != missing[i-1]:
                missing_num = i
                break
        print(missing_num)
        if missing_num == -1:
            missing_num = len(missing) + 1
        return [repeated, missing_num]

        
        

        