class Solution {
    public int[] singleNumbers(int[] nums) {
    	List<Integer> list = new ArrayList<>();
    	Map<Integer, Integer> map = new HashMap<>();
    	for (int num : nums) {
    		map.put(num, map.getOrDefault(num, 0) + 1);
    	}
    	for (int key : map.keySet()) {
    		if (map.get(key) == 1) {
    			list.add(key);
    		}
		}
		int[] res = int[2];
		for (int i = 0; i < list.size(); ++i) {
			res[i] = list.get(i);
		}
		return res;
    }
}