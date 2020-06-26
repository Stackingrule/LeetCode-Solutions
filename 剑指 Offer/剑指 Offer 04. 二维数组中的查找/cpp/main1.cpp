class Solution {
public:
    bool findNumberIn2DArray(vector<vector<int>>& matrix, int target) {
    	 //初始化 i 和 j 为数组左下角元素
    	int i = matrix.size() - 1;
    	int j = 0;
    	//如果 i 和 j 没有越界继续判断
    	while (i >= 0 && j < matrix[0].size()) {
    		if (matrix[i][j] > target) {
    			--i;
    		}
    		else if (matrix[i][j] < target) {
    			++j;
    		}
    		else {
    			return true;
    		}
    	}
    	return false;
    }
};