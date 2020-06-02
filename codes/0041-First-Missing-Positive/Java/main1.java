/**
* 思路是把1放在数组第一个位置 nums[0]，2放在第二个位置 nums[1]，
* 即需要把 nums[i] 放在 nums[nums[i] - 1]上，遍历整个数组，如果 nums[i] != i + 1, 而 nums[i] 为整数且不大于n，
* 另外 nums[i] 不等于 nums[nums[i] - 1] 的话，将两者位置调换，
* 如果不满足上述条件直接跳过，最后再遍历一遍数组，如果对应位置上的数不正确则返回正确的数
*/

class Solution {
    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
        	while (nums[i] > 0 && nums[i] <= nums.length && nums[nums[i] - 1] != nums[i]) {
        		swap(nums, i, nums[i] - 1);
        	}
        }
        for (int i = 0; i < nums.length; ++i) {
        	if (nums[i] != i + 1) return i + 1;
        }
        return nums.length + 1;
    }

    private void swap(int[] A, int a, int b) {
    	int temp = A[a];
    	A[a] = A[b];
    	A[b] = temp;
    }
}