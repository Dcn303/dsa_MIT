## we need to check the water trapped bar by bar 
## check what is the maximum wall height amongst the current left_Wall or left_bar height and the current(max_leftWall or max_leftbar height)
## the water level is determined by the lowest height amongst (max_leftWall or max_leftbar and max_rightWall or max_rightbar) 
## which ever is the lowest we pick up lets say if it is max_leftwall or max_leftbar  
## then we get the current trap water as trapped_water+= max(max_leftwall, height[ current left_Wall]) 
## same logic applies to the right_Wall as well 

class Solution {
public:
    int trap(vector<int>& height) {
        int maxL;
        int maxR;
        int L=0;
        int R=height.size()-1;
        int trapped_water=0;
        maxL=std::numeric_limits<int>::min();
        maxR=std::numeric_limits<int>::min();
            
        while(L<R)
        {
            maxL=max(maxL,height[L]);
            maxR=max(maxR,height[R]);
            if(maxL<maxR)
            {
                trapped_water+=maxL-height[L];
                L++;
            }
            else
            {
                trapped_water+=maxR-height[R];
                R--;
            }
         }
        return trapped_water;
    }
};