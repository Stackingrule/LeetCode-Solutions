class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int i = 0; i < nums.length; ++i) {
        	Integer ceiling = set.ceiling(nums[i]);
        	Integer floor = set.floor(nums[i]);
        	if ((ceiling != null && (long) ceiling - (long) nums[i] <= t) || (floor != null && (long) nums[i] - (long) floor <= t)) {
        		return true;
        	}
        	set.add(nums[i]);
        	if (set.size() > k) {
        		set.remove(nums[i - k]);
        	}
        }
        return false;
    }
}