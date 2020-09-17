class Solution {
    public int numSpecial(int[][] mat) {
        int res = 0;
        int m = mat.length, n = mat[0].length;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(mat[i][j] == 1 && check(i, j, mat)) res++;
            }
        }
        return res;
    }
    public boolean check(int i, int j, int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for(int k = 0; k < m; k++) {
            if(k != i && mat[k][j] == 1) return false;
        }
        for(int k = 0; k < n; k++) {
            if(k != j && mat[i][k] == 1) return false;
        }
        return true;
    }
}