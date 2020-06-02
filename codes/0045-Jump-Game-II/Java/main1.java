class Solution {
    public int jump(int[] nums) {
        int res = 0, n = nums.length, i = 0, cur = 0;
        while (cur < n - 1) {
        	++res;
        	int pre = cur;
        	for (; i <= pre; ++i) {
        		cur = Math.max(cur, nums[i] + i);
        	}
        	if (pre == cur) return -1;
        }
        return res;
    }
}