class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int[][] B = new int[A.length][A[0].length];
        //水平翻转
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                B[i][j] = A[i][A[0].length - j - 1];
            }
        }
        //反转
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                B[i][j] ^= 1;
            }
        }
        return B;
    }
}