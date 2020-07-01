class Solution {
    public int lengthOfLongestSubstring(String s) {
    	Set<Character> set = new HashSet<>();
    	int left = 0, right = 0, res = 0;
    	while (right < s.length()) {
    		while (set.contains(s.charAt(right))) {
    			set.remove(s.charAt(left));
    			++left;
    		}
    		set.add(s.charAt(right));
    		++right;
    		res = Math.max(res, right - left);
    	}
    	return res;
    }
}