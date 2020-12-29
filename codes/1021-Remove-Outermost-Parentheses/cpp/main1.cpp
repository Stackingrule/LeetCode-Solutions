class Solution {
public:
    string removeOuterParentheses(string S) {
        string ret = "";
        stack<char> st;
        int size = S.size();
        for (int i=0; i<size; i++){
            if (S[i] == '('){
                if (st.size() > 0)
                    ret += '(';
                st.push('(');
            }
            else{
                if (st.size() > 1)
                    ret += ')';
                st.pop();
            }
        }
        return ret;
    }
};