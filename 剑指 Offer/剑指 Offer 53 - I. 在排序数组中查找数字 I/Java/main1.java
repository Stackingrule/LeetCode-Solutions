class Solution {
    public int search(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int num : nums) {
    		map.put(num, map.getOrDefault(num, 0) + 1);
    	}
    	if (!map.containsKey(target)) {
    		return 0;
    	}
    	return map.get(target);
    }
}