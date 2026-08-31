LeetCode 18 - 4Sum

https://leetcode.com/problems/4sum/



Given an array nums and a target, return all unique quadruplets

\[a, b, c, d] such that a + b + c + d == target.



Pattern: Sort + fix two + two-pointer sweep (3Sum with one more layer)

Time: O(n^3)  Space: O(1) excluding output



Key points:

&#x20; - Fix i, fix j (j from i+1), then reset L=j+1 / R=size-1 per j

&#x20; - Skip duplicate i and j with if(...) continue

&#x20; - Use long long for sum: 4 \* 10^9 overflows int



Test Cases:

&#x20;                Input                Target    Expected Output

Case 1:  \[1,0,-1,0,-2,2]             0         \[\[-2,-1,1,2],\[-2,0,0,2],\[-1,0,0,1]]

Case 2:  \[2,2,2,2,2]                 8         \[\[2,2,2,2]]

