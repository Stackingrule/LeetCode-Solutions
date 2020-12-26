class Solution {
    int[][] dirs = new int[][] { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

    public int[][] spiralMatrixIII(int R, int C, int r0, int c0) {
        int[][] res = new int[R * C][2];
        if (R == 0 || C == 0) {
            return res;
        }

        res[0] = new int[] { r0, c0 };

        int count = 1;
        int index = 0;
        int k = 1;
        while (count < R * C) {
            for (int j = 0; j < 2; j++) {
                int[] dir = dirs[index % 4];
                for (int i = 0; i < k; i++) {
                    r0 += dir[0];
                    c0 += dir[1];
                    if (r0 >= 0 && r0 < R && c0 >= 0 && c0 < C) {
                        res[count++] = new int[] { r0, c0 };
                    }
                }

                index++;
            }

            k++;
        }

        return res;
    }
}