class Solution {
    public int[] exchange(int[] nums) {
    	int n = nums.length;
    	int[] res = new int[n];
    	int left = 0, right = n - 1;
    	for (int i = 0;i < n; ++i) {
    		if (nums[i] % 2 == 0) {
    			res[right--] = nums[i];
    		}
    		else {
    			res[left++] = nums[i];
    		}
    	}
    	return res;
    }
}