class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        vector<int> temp;
        vector<vector<int>>result;
        std::sort(nums.begin(),nums.end());
        int L=0;
        int R=nums.size()-1;
        long long sum=0;
        for(int i=0;i<nums.size()-1;i++)
        {
         if(i>0&&nums[i]==nums[i-1]) continue;  // i keeps moving forward whenever it encounters duplicate value however the condition i>0 makes sure that the first encounter value of i is executed and not missed out 
            for(int j=i+1;j<nums.size()-1;j++)
            {
                if(j>i+1&&nums[j]==nums[j-1]) continue;  // j keeps moving forward whenever it encounters duplicate value and the condition (j>i+1) makes sure that the first encountered value of j is executed and not missed out 
                    L=j+1;
                    R=nums.size()-1;
                while(L<R)
                {

                    sum=(long long) nums[i]+nums[j]+nums[L]+nums[R];
                    if(sum<target)
                    {
                        L++;
                        while(L<R && nums[L]==nums[L-1]) L++; // this condition makes sure that the L keeps on moving forward whenever the L encounters the duplicate value and also the L<R makes sure that when L does not exceed moving beyond the limits which is R 
                    }
                    else if(sum>target)
                    {
                        R--;
                        while(L<R && nums[R]==nums[R+1]) R--;  // this condition makes sure that the R keeps one moving backward whenever the R encounters the duplicate value and also the L<R makes sure that when R does not move beyond the limits which is R 
                    }
                    else if (sum==target)
                    {
                        temp.push_back(nums[i]);
                        temp.push_back(nums[j]);
                        temp.push_back(nums[L]);
                        temp.push_back(nums[R]); // this adds the nums[i],nums[j],nums[L] and nums[R] to the temp whose sum is equal to the target value 
                        result.push_back(temp);  // this makes sure that the encountered sequence of sum that is leading to the target is push back to the result where the result is a variable which holds the collection of 4 serquence of values whose sum give the target 
                        temp.clear();   // the value that were added to the temp needs to be clear out after the temp have been added to the result , making the temp ready to be added with the next sequence of 4 values whose sum is equal to the target 
                        L++; while(L<R&&nums[L]==nums[L-1]) L++; // this handles the duplicate value 
                        R--; while(L<R&& nums[R]==nums[R+1]) R--; // this handles the duplicate value 
                    }
                }
            }
        }
        return result; 
    }
};