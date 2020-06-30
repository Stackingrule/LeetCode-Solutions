class Solution {
    public String minNumber(int[] nums) {
    	String[] str = new String[nums.length];
    	for (int i = 0; i < nums.length; ++i) {
    		str[i] = String.valueOf(nums[i]);
    	}
    	Arrays.sort(str, (o1, o2) -> (o1 + o2).compareTo(o2 + o1));
    	StringBuilder res = new StringBuilder();
    	for (String s : str) {
    		res.append(s);
    	}

    	return res.toString();
    }
}