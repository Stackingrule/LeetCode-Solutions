class Solution {
    public int subarraySum(int[] nums, int k) {
        int res = 0, n = nums.length;
        for (int i = 0; i <n; ++i) {
        	int sum = nums[i];
        	if (sum == k) ++res;
        	for (int j = i + 1; j < n; ++j) {
        		sum += nums[j];
        		if (sum == k) ++res;
        	}
        }
        return res;
    }
}