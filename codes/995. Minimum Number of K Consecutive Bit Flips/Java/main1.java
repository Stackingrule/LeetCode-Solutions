class Solution {
    public int minKBitFlips(int[] A, int K) {
        int n = A.length;
        int ans = 0, curFlipped = 0;
        int[] isFlipped = new int[n];
        for (int i = 0; i < n; ++i) {
        	if (i >= K) curFlipped ^= isFlipped[i - K];
        	if (curFlipped % 2 == A[i]) {
        		if (i + K > n) return -1;
        		isFlipped[i] = 1;
        		curFlipped ^= 1;
        		++ans;
        	}
        }
        return ans;
    }
}