class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
    	int row = matrix.size();

    	//上下翻转
    	for (int i = 0; i < row / 2; ++i) {
    		for (int j = 0; j < row; ++j) {
    			int change = matrix[i][j];
    			matrix[i][j] = matrix[row - 1 - i][j];
    			matrix[row - 1 - i][j] = change;
    		}
    	}

    	//主对角线翻转
    	for (int i = 1; i < row; ++i) {
    		for (int j = 0; j < i; ++j) {
    			int change = matrix[i][j];
    			matrix[i][j] = matrix[j][i];
    			matrix[j][i] = change;
    		}
    	}
    }
};