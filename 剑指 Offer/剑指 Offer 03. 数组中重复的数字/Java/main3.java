class Solution {
    public int findRepeatNumber(int[] nums) {
    	int n = nums.length;
        for (int i = 0; i < n; ++i) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                int temp = nums[i];
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return -1;
    }
}