class Solution {
public:
    int maxArea(vector<int>& height) {
    	int res = 0;
    	int l = 0, r = height.size() - 1;
    	while(l < r) {
    		int h = min(height[l], height[r]);
    		res = max(res, h*(r -l));
    		while(l < r && h == height[l]) ++l;
    		while(l < r && h == height[r]) --r;
    	}

    	return res;
        
    }
};