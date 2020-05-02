class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
        	if (!set.contains(num)) {
        		set.add(num);
        	}
        	else {
        		set.remove(num);
        	}
        }
        int i = 0;
        for (int num : set) {
        	res[i++] = num;
        }
        return res;
    }
}