class Solution {
   public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int sum = 0;
        for (int a : A) {
            if (a % 2 == 0)
                sum += a;
        } // sum of even #s.
        int[] ans = new int[queries.length];
        for (int i = 0; i < ans.length; ++i) {
            int idx = queries[i][1];
            if (A[idx] % 2 == 0) {
                sum -= A[idx];
            } // from 1) and 2)
            A[idx] += queries[i][0];
            if (A[idx] % 2 == 0) {
                sum += A[idx];
            } // from 2) and 3)
            ans[i] = sum;
        }
        return ans;
    }
}