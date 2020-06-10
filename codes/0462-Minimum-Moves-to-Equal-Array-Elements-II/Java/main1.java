class Solution {
    public int minMoves2(int[] nums) {
        int res = 0, i = 0, j = nums.length - 1;
        Arrays.sort(nums);
        while (i < j) {
        	res += nums[j--] - nums[i++];
        }
        return res;
    }
}