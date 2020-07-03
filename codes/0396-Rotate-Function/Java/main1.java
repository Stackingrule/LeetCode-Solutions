class Solution {
    public int maxRotateFunction(int[] A) {
        if (A == null || A.length == 0) return 0;
        long cur = 0;
        long res = 0;
        long tol = 0;
        for (int i = 0; i < A.length; ++i) {
        	tol += A[i];
        	cur += i * A[i];
        }
        res = cur;
        reverse(A, 0, A.length - 1);
        for (int i = 0; i < A.length; ++i) {
        	cur = cur + tol - A.length * A[i];
        	res = Math.max(res, cur);
        }

        return res;
    }

    private void reverse(int[] A, int left, int right) {
    	while (left < right) {
    		int tmp = A[left];
    		A[left] = A[right];
    		A[right] = tmp;
    		++left;
    		--right
    	}
    }
}