/*
    暴力解法
 */
class Solution {
public:
    int trap(vector<int>& height) {
        int n = height.size();
        if(n <= 2)
            return 0;
        int ans = 0;
        for(int i = 1; i < n - 1; i++) {
            int l_max = height[i], r_max = height[i];
            for(int r = i + 1; r < n; r++) 
                r_max = max(r_max, height[r]);
            
            for(int l = i - 1; l >= 0; l--) 
                l_max = max(l_max, height[l]);
            
            ans += min(l_max, r_max) - height[i];
        }
        return ans;
        
    }
};