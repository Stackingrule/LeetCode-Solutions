class Solution {
public:
    char firstUniqChar(string s) {
    	vector<int> hash(256);
    	for (char  c : s) {
    		++hash[c];
    	}
    	for (char c : s) {
    		if (hash[c] == 1) {
    			return c;
    		}
    	}
    	return ' ';
    }
};