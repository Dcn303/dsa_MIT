LeetCode 42 - Trapping Rain Water

https://leetcode.com/problems/trapping-rain-water/



Given n non-negative integers representing an elevation map where the width

of each bar is 1, compute how much water it can trap after raining.



Pattern: Two pointers converging inward, tracking running max walls

Time: O(n)  Space: O(1)



Key idea: water above a bar = min(maxLeft, maxRight) - height\[bar].

The shorter wall is the bottleneck, so process whichever side has the

smaller running max - that side's water is fully determined.

&#x20; maxL = max(maxL, height\[L]); maxR = max(maxR, height\[R]);

&#x20; if (maxL < maxR) { water += maxL - height\[L]; L++; }

&#x20; else             { water += maxR - height\[R]; R--; }



Test Cases:

&#x20;                Input                              Expected Output

Case 1:  \[0,1,0,2,1,0,1,3,2,1,2,1]                 6

Case 2:  \[4,2,0,3,2,5]                             9

