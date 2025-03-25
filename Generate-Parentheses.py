class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        if n == 1:
            return ["()"]
        syms = {"()"}
        for j in range(n-1):
            new_syms = set()
            for sym in syms:
                for i in range(len(sym)):
                    new_syms.add(sym[:i] + "()" + sym[i:])
            syms = new_syms
        return syms
        