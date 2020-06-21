class Solution {
    public int countPrimes(int n) {
        if (n < 3) return 0;
        if (n == 3) return 1;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i < Math.sqrt(n); ++i) {
        	for (int j = 2; i * j < n; ++j) {
        		isPrime[i * j] = true;
        	}
        }

        int res = 0;
        for (int i = 2; i < n; ++i) {
        	if (!isPrime[i]) ++res;
        }

        return res;
    }
}