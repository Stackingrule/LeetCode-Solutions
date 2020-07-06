class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
        	map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int a : map.keySet()) {
        	if (map.get(a) > 1) {
        		res.add(a);
        	}
        }
        return res;
    }
}