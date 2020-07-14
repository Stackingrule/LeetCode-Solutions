class Solution {
    public int majorityElement(int[] nums) {
    	int count = 1, major = nums[0];
    	for (int num : nums) {
    		if (num == major) {
    			count++;
    		}
    		else {
    			count--;
    		}
    		if (count == 0) {
    			major = num;
    			count = 1;
    		}
    	}

    	// 验证
    	int t = nums.length / 2 + 1;
    	count = 0;
    	for (int num : nums) {
    		if (num == major) {
    			++count;
    		}
    		if (count == t) {
    			return major;
    		}
    	}
    	return -1;
    }
}