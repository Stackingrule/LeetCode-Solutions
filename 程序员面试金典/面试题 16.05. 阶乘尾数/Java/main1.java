class Solution {
    public int trailingZeroes(int n) {
    	int cnt = 0;
    	for (int i = 1; i <= n; ++i) {
    		int num = i;
    		while (num > 0) {
    			if (num % 5 == 0) {
    				cnt++;
    				num /= 5;
    			}
    		}
    	}
    	return cnt;
    }
}