
class Solution:
    def isBalanced(self, s):
        # code here
        if len(s) == 1:
            return False
        stack = []
        for i in range(len(s)):
            if s[i] == '(' or s[i] == '{' or s[i] == '[':
                stack.append(s[i])
            else :
                if not stack:
                    return False
                else:
                    if (stack[-1]=='(' and s[i] == ')') or  (stack[-1]=='{' and s[i] == '}') or  (stack[-1]=='[' and s[i] == ']'):
                        stack.pop()
                    else:
                        return False
        return len(stack) == 0

#{ 
 # Driver Code Starts
#Initial Template for Python 3

import atexit
import io
import sys

#Contributed by : Nagendra Jha

_INPUT_LINES = sys.stdin.read().splitlines()
input = iter(_INPUT_LINES).__next__
_OUTPUT_BUFFER = io.StringIO()
sys.stdout = _OUTPUT_BUFFER


@atexit.register
def write():
    sys.__stdout__.write(_OUTPUT_BUFFER.getvalue())


if __name__ == '__main__':
    test_cases = int(input())
    for cases in range(test_cases):
        s = str(input())
        obj = Solution()
        if obj.isBalanced(s):
            print("true")
        else:
            print("false")
        print("~")

# } Driver Code Ends