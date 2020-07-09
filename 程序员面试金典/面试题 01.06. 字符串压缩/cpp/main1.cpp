class Solution {
public:
    string compressString(string S) {
    	int i = 0, j = 0, len = S.size();
        string res;
    	while (i < len) {
    		while (S[i] == S[j]) {
    			++j;
    		}
    		res += S[i] + to_string(j - i);
    		i = j;
    	}
    	if (res.size() >= len) return S;
    	return res;
    }
};