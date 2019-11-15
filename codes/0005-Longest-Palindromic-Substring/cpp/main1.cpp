class Solution {
private:
	void searchPalindrome(string s, int lo, int hi, int &start, int &maxLen) {
		while(lo >= 0 && hi < s.size() && s[lo] == s[hi]) {
			--lo;
			++hi;
		}
		if(maxLen < hi - lo - 1) {
			start = lo + 1;
			maxLen = hi - lo - 1;
		}
	}


public:
    string longestPalindrome(string s) {
    	if(s.size() < 2) return s;
    	int n = s.size(), start = 0, maxLen = 0;
    	for(int i = 0; i < n - 1; ++i) {
    		searchPalindrome(s, i, i, start, maxLen);
    		searchPalindrome(s, i, i + 1, start, maxLen);
    	}

    	return s.substr(start, maxLen);        
    }
};