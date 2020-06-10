/*
* 题目就可以转换为分别求出以每个字符(a-z)为结束字符的最长连续字符串
*/
class Solution {
public:
    int findSubstringInWraproundString(string p) {
        vector<int> cnt(26, 0);
        int len = 0;
        for (int i = 0; i < p.size(); ++i) {
        	if (i > 0 && (p[i] == p[i - 1] + 1 || p[i - 1] - p[i] == 25)) {
        		++len;
        	}
        	else {
        		len = 1;
        	}
        	cnt[p[i] - 'a'] = max(len, cnt[p[i] - 'a']);
        }

        return accumulate(cnt.begin(), cnt.end(), 0);
    }
};