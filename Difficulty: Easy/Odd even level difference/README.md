<h2><a href="https://www.geeksforgeeks.org/problems/odd-even-level-difference/1">Odd even level difference</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a Binary Tree. Find the difference between the sum of node values at even levels and the sum of node values at odd levels.</span></p>
<p><strong><span style="font-size: 18px;">Examples:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root [1, 2, 3]
            1
          /   \
         2     3</span>
<span style="font-size: 18px;"><strong>Output:</strong> -4</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>sum at odd levels - sum at even levels = (1)-(2+3) = 1-5 = -4</span>
</pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [10, 20, 30, 40, 60]
            10
          /    \
        20      30
       /     \         
     40    60      </span>
<span style="font-size: 18px;"><strong>Output:</strong> 60</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>sum at odd levels - sum at even levels = (10+40+60) - (20+30) = 110 - 50 = 60</span> </pre>
<pre><span style="font-size: 18px;"><strong>Input: </strong>root = [1, 2, 4]
            1
          /   \
         2     4</span>
<span style="font-size: 18px;"><strong>Output:</strong> -4</span>
<span style="font-size: 18px;"><strong>Explanation: </strong>sum at odd levels - sum at even levels = (1)-(2+4) = 1-6 = -5</span></pre>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ number of nodes ≤ 10<sup>5<br></sup>1 ≤ node-&gt;data ≤ 10<sup>5</sup><sup><br></sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Amazon</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Tree</code>&nbsp;<code>Data Structures</code>&nbsp;