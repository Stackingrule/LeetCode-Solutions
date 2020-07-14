class Solution {
    public int majorityElement(int[] nums) {
    	HashMap<Integer, Integer> map = new HashMap<>();
    	for (int num : nums) {
    		map.put(num, map.getOrDefault(num, 0) + 1);
    	}
    	int mid = nums.length >> 1;
    	for (int key : map.keySet()) {
    		if (map.get(key) > mid)
    			return key;
    	}
    	return -1;
    }
}