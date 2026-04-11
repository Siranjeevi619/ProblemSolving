class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        word1_len = len(word1)
        word2_len = len(word2)
        i, j = 0,0
        res = ""
        while(i < word1_len and j < word2_len) :
            res+= (word1[i])
            res+= (word2[j])
            i+=1
            j+=1
        if i < word1_len:
            res += (word1[i:])
        if j < word2_len :
            res += (word2[j:])
        return res
