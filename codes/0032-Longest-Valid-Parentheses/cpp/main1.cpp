class Solution {
public:
    int longestValidParentheses(string s) {
        int res = 0, start  = 0, n = s.size();
        stack<int> st;
        for (int i = 0; i < n; ++i) {
        	if (s[i] == '(') st.push(i);
        	else if (s[i] == ')') {
        		if (st.empty()) start = i + 1;
        		else {
        			st.pop();
        			res = st.empty() ? max(res, i - start + 1) : max(res, i - st.top());
        		}
        	}
        }
        return res;
    }
};