class Solution {
public:
    bool isFlipedString(string s1, string s2) {
    	int m = s1.size(), n = s2.size();
    	if (m != n) return false;
    	if (m == 0) return true;
    	for (int i = 0; i < m; ++i) {
    		if (s1[i] == s2[0]) {
    			if (s1.substr(0, i) == s2.substr(m - i) && s1.substr(i) == s2.substr(0, m - i))
    				return true;
    		}
    	}
    	return false;
    }
};