class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
       std::sort(nums.begin(),nums.end());
       vector<vector<int>>result;
       vector<int> temp;
       int lo;
       int hi;
       int sum;
       int i;
       for(i=0;i<nums.size();i++)
       {

// this below if condition  avoid the duplicate repeating on the left side or element pointed by lower pointer (lo)  eg [0,0,0,0,0,1,1,2] , here the after the first zeros the remaining zeros are duplicate zeros and this below if condition makes sure those duplice zeros are 
//avoid 
        if(i>0&&nums[i]==nums[i-1])
            {
            }
        else
        {
            lo=i+1;
            hi=nums.size()-1;
            while(lo<hi)
            {
// this below if condition avoid the duplicates or repeating element on the right side or element pointed by higher pointer (hi) eg [0,0,0,0,0,1,1,2] in this there are two 1's when we move the hi pointer from right to left i.e. 
//when we do hi-- we will encounter 1 two times hence we avoid the duplicating 1 
                if(hi<nums.size()-1&& nums[hi]==nums[hi+1])    
                    {
                        hi--;
                    }
                else    
                {
                    sum=nums[i]+(nums[lo]+nums[hi]);
                if(sum==0)
                    {
                        temp.push_back(nums[i]);
                        temp.push_back(nums[lo]);
                        temp.push_back(nums[hi]);
                        result.push_back(temp);
                        temp.clear();
                        lo++;
                        hi--;
                     }
                    else if(sum<0)
                        {
                            lo++;
                        }
                    else if(sum>0)
                        {
                            hi--;
                        }
                }
            }
        }
       } 
       return result;
        }
    };