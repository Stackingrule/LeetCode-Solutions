class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) set.add(num);
    	for (int num : nums) {
    		if (set.remove(num)) {
    			int pre = num - 1, next = num + 1;
    			while (set.remove(pre)) --pre;
    			while (set.remove(next)) ++ next;
    			res = Math.max(res, next - pre - 1);
    		}
    	}
    	return res;
    }
}