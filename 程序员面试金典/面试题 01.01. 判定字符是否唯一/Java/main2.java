class Solution {
    public boolean isUnique(String astr) {
    	char[] strs = astr.toCharArray();
        int[] idx = new int[256];
        for (int i = 0; i < strs.length; ++i) {
            if (idx[strs[i]] == 0) {
                idx[strs[i]]++;
            } else {
                return false;
            }
        }
        return true;
    }
}