/*
* 只要统计出每一位的1的个数即可
*/
class Solution {
    public int totalHammingDistance(int[] nums) {
        int res = 0, n = nums.length;
        for (int i = 0; i < 32; ++i) {
        	int cnt = 0;
        	for (int num : nums) {
        		if ((num & (1 << i)) != 0) {
        			++cnt;
        		}
        	}
        	res += cnt * (n - cnt);
        }
        return res;
    }
}