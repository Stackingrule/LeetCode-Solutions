class Solution {
    public int findPairs(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 0)
        	return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int a = 0;
        for (int num : nums) {
        	map.put(num, a++);
        }
        int res = 0;
        for (int i = 0; i < nums.length; ++i) {
        	if (map.containsKey(nums[i] + k) && map.get(nums[i] + k) != i) {
        		map.remove(nums[i] + k);
        		res++;
        	}
        }
        return res;
    }
}