class Solution {
    public boolean canPermutePalindrome(String s) {
    	int[] freq = new int[256];
    	for (int c : s.toCharArray()) {
    		freq[c]++;
    	}
    	int res = 0;
    	for (int i = 0; i < 256; ++i) {
    		if (freq[i] % 2 != 0) {
    			res++;
    			if (res == 2) {
    				return false;
    			}
    		}
    	}
    	return true;
    }
}