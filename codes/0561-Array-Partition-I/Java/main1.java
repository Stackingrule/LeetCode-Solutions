class Solution {
    public int arrayPairSum(int[] nums) {
        int res = 0, n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n; i += 2) {
        	res += nums[i];
        }
        return res;
    }
}