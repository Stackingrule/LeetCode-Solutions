class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        List<List<Integer>> res = new ArrayList<>();
        // corner case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return res;
        }

        // normal case
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] pacific = new int[m][n];
        int[][] atlantic = new int[m][n];
        // scan the edge
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dfs(matrix, pacific, i, j, matrix[i][j]);
                }
                if (i == m - 1 || j == n - 1) {
                    dfs(matrix, atlantic, i, j, matrix[i][j]);
                }
            }
        }

        // the rest of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] == 1 && atlantic[i][j] == 1) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    private void dfs(int[][] matrix, int[][] visited, int i, int j, int prevHeight) {
        // corner case
        if (i < 0 || j < 0 || i >= matrix.length || j >= matrix[0].length || visited[i][j] == 1
                || matrix[i][j] < prevHeight) {
            return;
        }
        visited[i][j] = 1;
        dfs(matrix, visited, i - 1, j, matrix[i][j]);
        dfs(matrix, visited, i + 1, j, matrix[i][j]);
        dfs(matrix, visited, i, j - 1, matrix[i][j]);
        dfs(matrix, visited, i, j + 1, matrix[i][j]);
    }
}