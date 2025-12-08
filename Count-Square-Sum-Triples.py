1class Solution:
2    def countTriples(self, n: int) -> int:
3        count = 0
4        for i in range(1, n+1):
5            for j in range(1, n+1):
6                k = int((i*i + j*j) ** 0.5)
7                if k*k == i*i + j*j and k <= n:
8                    count += 1
9        return count
10        