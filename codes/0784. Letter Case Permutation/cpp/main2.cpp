class Solution
{
public:
    vector<string> letterCasePermutation(string S)
    {
        vector<string> ans;
        dfs(S, 0, ans);
        return ans;
    }

private:
    void dfs(string &S, int s, vector<string> &ans)
    {
        if (s == S.length())
        {
            ans.push_back(S);
            return;
        }
        dfs(S, s + 1, ans);
        if (!isalpha(S[s]))
            return;
        S[s] ^= (1 << 5);
        dfs(S, s + 1, ans);
        S[s] ^= (1 << 5);
    }
};