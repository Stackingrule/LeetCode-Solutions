class Solution {
public:
    char findTheDifference(string s, string t) {
        unordered_map<char, int> m;
        for (char ch : s) ++m[ch];
    	for (char ch : t) {
    		if (--m[ch] < 0) return ch;
    	}
    	return 0;
    }
};