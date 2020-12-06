class Solution {
public:
    int projectionArea(vector<vector<int>>& grid) {
		int n = grid[0].size(), res = 0;
		for (int i = 0; i < n; ++i) {
			int rowMax = 0, colMax = 0;
			for (int j = 0; j < n; ++j) {
                if (grid[i][j] > 0) ++res;
				rowMax = max(rowMax, grid[i][j]);
				colMax = max(colMax, grid[j][i]);
			}
			res += rowMax + colMax;
		}
		return res;
    }
};
