class Solution:
    def reverseWords(self, s: str) -> str:
        rev = " ".join(reversed(s.split()))
        return rev