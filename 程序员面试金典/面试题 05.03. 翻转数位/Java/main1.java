class Solution {
    public int reverseBits(int num) {
    	int res = 0;
    	int cnt = 0, pre = 0;
    	while (num > 0) {
    		if ((num & 1) == 1) {
    			++cnt;
    		}
    		else {
    			res = Math.max(res, cnt + pre + 1);
    			pre = cnt;
    			cnt = 0;
    		}
    		num >>>= 1;
    	}
    	res = Math.max(res, cnt + pre + 1);
    	return res;
    }
}