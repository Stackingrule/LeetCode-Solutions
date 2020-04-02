/**
*以每一个字符为中心，像两边扩散来寻找回文串，这个算法的时间复杂度是 O(n*n)，
*可以通过 OJ，就是要注意奇偶情况，由于回文串的长度可奇可偶，
*比如 "bob" 是奇数形式的回文，"noon" 就是偶数形式的回文，两种形式的回文都要搜索，对于奇数形式的，
*我们就从遍历到的位置为中心，向两边进行扩散，对于偶数情况，我们就把当前位置和下一个位置当作偶数行回文的最中间两个字符，然后向两边进行搜索，
*/
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