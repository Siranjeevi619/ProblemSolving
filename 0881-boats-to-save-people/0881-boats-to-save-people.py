class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        left , right = 0, len(people) -1
        count = 0
        while left <= right :
            remains = limit - people[right] 
            count +=1
            right -=1
            if left <= right and remains >= people[left]:
                left+=1
        return count