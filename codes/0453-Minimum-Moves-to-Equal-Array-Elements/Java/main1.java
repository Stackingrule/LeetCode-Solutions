class Solution {
    public int minMoves(int[] nums) {
        int mn = Integer.MAX_VALUE, res = 0;
        for (int num : nums) mn = Math.min(mn, num);
    	for (int num : nums) res += num - mn;
		return res;
    }
}