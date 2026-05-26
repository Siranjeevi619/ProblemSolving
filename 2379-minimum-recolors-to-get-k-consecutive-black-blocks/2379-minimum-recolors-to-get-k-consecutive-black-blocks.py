class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        # white_count = 0
        # black_count = 0
        # for i in blocks:
        #     if i == 'W':
        #         white_count +=1
        #     else :
        #         black_count += 1
        left = 0
        count = 0
        res = 0
        min_count = 1e9
        for right in range(0, len(blocks)):
            if blocks[right] == "W":
                count += 1

            while right - left + 1 > k:
                if blocks[left] == "W":
                    count -= 1
                left += 1

            # count = max(count, res)
            # min_count = min(count,min_count)
            if right - left + 1 == k:
                min_count = min(count, min_count)

        return min_count
