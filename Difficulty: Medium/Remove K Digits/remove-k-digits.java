//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String S = sc.next();
            int K = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.removeKdigits(S, K));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public String removeKdigits(String S, int K) {
        // code here\
        Stack <Character> stack = new Stack<>();
        for(char ch : S.toCharArray()){
            while(!stack.isEmpty() && stack.peek() - '0' > ch - '0' && K >0){
                stack.pop();
                K-=1;
            }
            stack.push(ch);
        }
        
        while( K > 0 && !stack.isEmpty()){
            stack.pop();
            K-=1;
        }
        if(stack.isEmpty()){
            return "0";
        }
        StringBuilder reduced = new StringBuilder();
        while(!stack.isEmpty()){
            reduced.append(stack.pop());
        }
        reduced.reverse();
        
        StringBuilder answer =new StringBuilder();
        int foundZero = 0;
        for(int i = 0 ; i < reduced.length() ; i+=1){
            char ele = reduced.charAt(i);
            if(ele == '0' && foundZero == 0){
                continue;
            }
            else{
                answer.append(ele);
                foundZero = 1;
            }
        }
        if(answer.length() == 0){
            answer.append("0");
        }
        return new String(answer);
        
    }
}