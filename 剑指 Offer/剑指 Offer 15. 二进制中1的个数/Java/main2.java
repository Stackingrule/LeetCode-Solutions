public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        int t = 1;
        for (int i = 1; i <= 32; ++i) {
        	if ((n & t) != 0 ) {
        		++res;
        	}
        	t <<= 1;
        }
        return res;
    }
}