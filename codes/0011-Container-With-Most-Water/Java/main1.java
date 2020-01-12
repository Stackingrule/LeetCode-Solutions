class Solution {
    public int maxArea(int[] height) {
    	int max = 0;
    	for (int i = 0; i < height.length - 1; i++) {
    		for (int j = i + 1; j < height.length; j++) {
    			int area = (j - i) * Math.min(height[i], height[j]);
    			max = Math.max(max, area);
    		}
    	}
        return max;
    }
}

/*
* 
1. 枚举
2. 


*/