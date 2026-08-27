LeetCode 15 - 3Sum

https://leetcode.com/problems/3sum/



Given an integer array nums, return all the triplets

\[nums\[i], nums\[j], nums\[k]] such that i != j, i != k,

and j != k, and nums\[i] + nums\[j] + nums\[k] == 0.



The solution set must not contain duplicate triplets.



Pattern: Sort + Fix one + Two-pointer sweep

Time: O(n^2)  Space: O(1) excluding output



Test Cases:

&#x20;                Input                              Expected Output

Case 1:  \[1,2,0,1,0,0,0,0]                          \[\[0,0,0]]

Case 2:  \[-1,0,1,2,-1,-4]                           \[\[-1,-1,2],\[-1,0,1]]

Case 3:  \[0,1,1]                                    \[]

Case 4:  \[0,0,0]                                    \[\[0,0,0]]

Case 5:  \[-100,-70,-60,110,120,130,160]             \[\[-100,-60,160],\[-70,-60,130]]

