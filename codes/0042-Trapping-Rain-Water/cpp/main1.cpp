class Solution {
public:
    int trap(vector<int>& height) {
    	int res = 0, lo = 0, hi = height.size() - 1;

    	while( lo < hi ) {
    		int mn = min(height[lo], height[hi]);
    		if(mn == height[lo]) {
    			++lo;
    			while(lo < hi && height[lo] < mn) {
    				res += mn - height[lo++];
    			}
    		}
    		else {
    			--hi;
    			while(lo < hi && height[hi] < mn) {
    				res += mn - height[hi--];
    			}
    		}
    	}
    	return res;
    }
};