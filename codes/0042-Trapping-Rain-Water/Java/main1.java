class Solution {
    public int trap(int[] height) {
        int res = 0, left = 0, right = height.length() - 1;
        while (left < right) {
        	int min = Math.min(height[left], height[right]);
        	if (min == height[left]) {
        		++left;
        		while (left < right && height[left] < min) {
        			res += min - height[left++];
        		}
        	}
        	else {
        		--right;
        		while (left < right && height[right] < min) {
        			res += min - height[right--];
        		}
        	}
        }
        return res;
    }
}