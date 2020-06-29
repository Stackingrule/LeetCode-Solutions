class Solution {
    public int majorityElement(int[] nums) {
    	int n = nums.length;
    	int times = 0;
    	if (n % 2 == 0) times = n / 2;
    	else times = n / 2 +1;

    	Map<Integer, Integer> map = new HashMap<>();
    	for (int num : nums) {
    		map.put(num, map.getOrDefault(num, 0) + 1);
    	}
    	for (int key : map.keySet()) {
    		if (map.get(key) >= times) {
    			return key;
    		}
    	}
    	return 0;
    }
}