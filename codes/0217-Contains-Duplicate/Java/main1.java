class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
        	if (!set.add(num)) {
        		return true;
        	}
        }
        return false;
    }
}