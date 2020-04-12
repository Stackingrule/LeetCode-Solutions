class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[128];
        Arrays.fill(last, -1);
        int start = 0;
        int res = 0;
        for (int i = 0; i < s.length(); ++i) {
        	if (last[s.charAt(i)] != -1) {
        		start = Math.max(start, last[s.charAt(i)] + 1);
        	}
        	last[s.charAt(i)] = i;
        	res = Math.max(res, i - start + 1);
        }
        return res;
    }
}