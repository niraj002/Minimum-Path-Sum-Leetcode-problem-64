# Minimum-Path-Sum-Leetcode-problem-64
Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.  
Note: You can only move either down or right at any point in time.  
Example 1: [[1,3,1],  
            [1,5,1],  
            [4,2,1]] 
Given the above grid map, return 7. Because the path 1→3→1→1→1 minimizes the sum.

This is one of the popular questions on vrious coding sites and interviews
Solution: Design a dynamic problem solution using a 2D array that stores the minimum sum of number to reach the final point
The solution passes through all the elements of the input array exactly once
The solution also uses the same memory as the input.
