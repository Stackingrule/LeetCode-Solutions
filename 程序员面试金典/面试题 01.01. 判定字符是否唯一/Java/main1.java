class Solution {
    public boolean isUnique(String astr) {
    	char[] strs = astr.toCharArray();
    	Arrays.sort(strs);
    	for (int i = 1; i < strs.length; ++i) {
    		if (strs[i - 1] == strs[i]) {
    			return false;
    		}
    	}
    	return true;
    }
}