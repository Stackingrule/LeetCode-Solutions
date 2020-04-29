class Solution {
    public int findMaxLength(int[] nums) {
        int res = 0, n = nums.length, sum = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, -1);
        for (int i = 0; i < n; ++i) {
        	sum += (nums[i] == 1) ? 1 : -1;
        	if (m.containsKey(sum)) {
        		res = Math.max(res, i - m.get(sum));
        	} else {
        		m.put(sum, i); 
        	}
        }
        return res;
    }
}