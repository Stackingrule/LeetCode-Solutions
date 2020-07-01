class Solution {
public:
    int lengthOfLongestSubstring(string s) {
    	int n = s.size();
    	if (n < 2) return n;
    	int left = 0, right = 0;
    	unordered_map<char, int> window;
    	int res = 0;
    	char c1, c2;
    	while (right < n) {
    		c1 = s[right++];
    		++window[c1];
    		while (window[c1] > 1) {
    			c2 = s[left];
    			--window[c2];
    			++left;
    		}
    		res = max(res, right - left);
    	}
    	return res;
    }
};