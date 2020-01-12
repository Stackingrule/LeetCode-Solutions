class Solution {
public:
    int maxArea(vector<int>& height) {
    	int res = 0;
    	for (int i = 0, j = height.size() - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i ++] : height[j --];
            res = max(res, (j - i + 1) * minHeight);
        }
        return res;
    }
};