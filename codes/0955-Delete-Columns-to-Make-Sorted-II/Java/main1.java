class Solution {
    public int minDeletionSize(String[] A) {
        int m = A.length, n = A[0].length();
        int res = 0;
        boolean flag;
        boolean[] sorted = new boolean[m];

        for (int i = 0; i < n; ++i) {
            flag = true;
            for (int j = 0; j < m - 1; ++j) {
                if (!sorted[j]) {
                    if (A[j].charAt(i) > A[j + 1].charAt(i)) {
                        flag = false;
                        break;
                    }
                }
            }

            if (!flag) {
                ++res;
            } else {
                for (int j = 0; j < m - 1; ++j) {
                    if (A[j].charAt(i) < A[j + 1].charAt(i)) {
                        sorted[j] = true;
                     }
                }
            }
        }

        return res;
    }
}