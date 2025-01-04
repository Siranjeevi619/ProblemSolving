<h2><a href="https://www.geeksforgeeks.org/problems/next-greater-element/1">Next Greater Element in Circular Array</a></h2><h3>Difficulty Level : Difficulty: Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an circular array <strong>arr[ ]</strong> of size <strong>n</strong> having distinct elements, the task is to find the next greater element for each element of the array .<br></span></p>
<p><span style="font-size: 18px;"><strong>Note :</strong> The next greater element of an element in the array is the first greater number to its traversing-order next in the array, which means you could search circularly to find its next greater number. If it doesn't exist, return -1 for this number.</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: 
n = 4, arr[] = [1 3 2 4]
<strong>Output</strong>:
3 4 4 -1
<strong>Explanation</strong>:
In the array, the next larger element 
to 1 is 3, 3 is 4, 2 is 4 and for 4? 
since it doesn't exist, it is -1.<br>
</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: 
n = 5, arr[] = [6 8 0 1 3]
<strong>Output</strong>:
8 -1 1 3 6
<strong>Explanation</strong>:
In the array, the next larger element to 6 is 8, <br>for 8 there is no larger elements hence it is -1, for 0 it is 1,<br>for 1 it is 3 and then <br>for 3 there is 6.<br><br></span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>This is a <strong>function </strong>problem. You only need to complete the function <strong>nextLargerElement()&nbsp;</strong>that takes list of integers&nbsp;<strong>arr[ ] </strong>and<strong>&nbsp;n</strong>&nbsp;as input parameters<strong> </strong>and returns list of integers&nbsp;of length N&nbsp;denoting the next greater elements for all the corresponding elements in the input array.</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity</strong> : O(n)<br><strong>Expected Auxilliary Space</strong> : O(n)</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ n ≤&nbsp;10<sup>6</sup><br>0 ≤&nbsp;arr<sub>i</sub> ≤&nbsp;10<sup>18</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Stack</code>&nbsp;<code>Data Structures</code>&nbsp;