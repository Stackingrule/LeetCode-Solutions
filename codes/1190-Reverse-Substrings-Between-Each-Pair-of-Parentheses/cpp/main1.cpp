class Solution {
public:
    string reverseParentheses(string s) {
        stack<int> st;
        string res;
        for (const char &c : s) {
            if (c == '(') {
                st.push(res.length());
            }
            else if (c == ')') {
                const int t = st.top();
                st.pop();
                reverse(res.begin() + t, res.end());
            }
            else {
                res += c;
            }
        }
        return res;
    }
};