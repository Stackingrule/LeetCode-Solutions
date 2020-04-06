class Solution {
public:
    int titleToNumber(string s) {
        long res = 0;
        for (char ch : s) {
        	res = res * 26 + ch - 'A' + 1;
        }
        return res;
    }
};