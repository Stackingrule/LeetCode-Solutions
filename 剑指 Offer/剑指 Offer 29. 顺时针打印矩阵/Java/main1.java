class Solution {
    public int[] spiralOrder(int[][] matrix) {
    	if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
    	List<Integer> list = new ArrayList<>();
    	int m = matrix.length, n = matrix[0].length;
    	int up = 0, down = m - 1, left = 0, right = n - 1;
    	while (true) {
    		for (int i = left; i <= right; ++i) list.add(matrix[up][i]);
			if (++up > down) break;
			for (int j = up; j <= down; ++j) list.add(matrix[j][right]);
			if (--right < left) break;
			for (int i = right; i >= left; --i) list.add(matrix[down][i]);
			if (--down < up) break;
			for (int j = down; j >= up; --j) list.add(matrix[j][left]);
			if (++left > right) break;
    	}

    	int[] res = new int[list.size()];
    	for (int i = 0; i < list.size(); ++i) {
    		res[i] = list.get(i);
    	}

    	return res;
    }
}