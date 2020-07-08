class Solution {
public:
    bool canPermutePalindrome(string s) {
    	int freq[256] = {0};
    	for (char c : s) {
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
};