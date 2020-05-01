class Solution {
    public List<Integer> majorityElement(int[] nums) {
    	List<Integer> res = new ArrayList<>();
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
        	map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if (entry.getValue() > n / 3) {
        		res.add(entry.getKey());
        	}
        }
        return res;
    }
}