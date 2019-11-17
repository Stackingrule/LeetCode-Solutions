class Solution {
public:
    string addBinary(string a, string b) {
    	string res = "";
    	int m = a.size() - 1, n = b.size() - 1, carray = 0;
    	while(m >= 0 || n >= 0) {
    		int p = m >= 0 ? a[m--] - '0': 0;
    		int q = n >= 0 ? b[n--] - '0': 0;
    		int sum = p + q + carray;
    		res = to_string(sum % 2) + res;
    		carray = sum / 2;

    	}
        return carray == 1 ? "1" + res: res;
    }
};