class Solution {
public:
    string addBinary(string a, string b) {
    	int carry = 0;
        int i = a.size() - 1;
        int j = b.size() - 1;
        string res;
        while (i >= 0 || j >= 0) {
            int s = (i >= 0 ? a[i--] - '0' : 0) + (j >= 0 ? b[j--] - '0' : 0) + carry;
            carry = s >> 1;
            res += '0' + (s & 1);
        }
        if (carry) res += '1';
        return { rbegin(ans), rend(ans) };
    }
};