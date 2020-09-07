class Solution
{
public:
    string removeDuplicates(string S)
    {
        int n = S.size();
        stack<char> st;
        string res;
        if (!S.size())
            return res;
        st.push(S[0]);
        for (int i = 1; i < n; ++i)
        {
            if (!st.empty() && S[i] == st.top())
            {
                st.pop();
            }
            else
            {
                st.push(S[i]);
            }
        }
        while (!st.empty())
        {
            res = st.top() + res;
            st.pop();
        }
        return res;
    }
};