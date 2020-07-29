class Solution
{
public:
    vector<string> generateParenthesis(int n)
    {
        vector<string> ret;
        string tmp;
        dfs(ret, tmp, 0, 0, 0, n);
        return ret;
    }

    void dfs(vector<string> &ret, string &tmp, int index, int left, int right, int n)
    {
        if (left < right || left > n || right > n)
            return;
        if (index == 2 * n)
        {
            ret.push_back(tmp);
            return;
        }
        tmp += "(";
        dfs(ret, tmp, index + 1, left + 1, right, n);
        tmp.pop_back();
        tmp += ")";
        dfs(ret, tmp, index + 1, left, right + 1, n);
        tmp.pop_back();
    }
};