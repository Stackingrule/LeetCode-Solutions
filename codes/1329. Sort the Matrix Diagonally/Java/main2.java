class Solution {
    int rowNum, colNum;
    public int[][] diagonalSort(int[][] mat) {
        rowNum = mat.length;
        colNum = mat[0].length;
        for (int i = 0; i < rowNum; i++) {
            insertionSort(mat, i, 0);
        }
        for (int j = 1; j < colNum; j++) {
            insertionSort(mat, 0, j);
        }
        return mat;
    }
    
    private void insertionSort(int[][] mat, int startRow, int startCol) {
        for (int i = startRow + 1; i < rowNum; i++) {
            int j = startCol + (i - startRow);
            if (j >= colNum) break;
            int val = mat[i][j];
            int insertRow = i, insertCol = j;
            while (insertRow > 0 && insertCol > 0
                   && mat[insertRow - 1][insertCol - 1] > val) {
                mat[insertRow][insertCol] = mat[--insertRow][--insertCol];
            }
            mat[insertRow][insertCol] = val;
        }
    }
}