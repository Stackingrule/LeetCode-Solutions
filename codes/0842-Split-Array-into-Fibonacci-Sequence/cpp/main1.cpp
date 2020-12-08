class Solution
{
public:
    vector<int> splitIntoFibonacci(string S)
    {
        vector<int> res, out;
        helper(S, 0, out, res);
        return res;
    }
    void helper(string &S, int start, vector<int> &out, vector<int> &res)
    {
        if (!res.empty())
            return;
        if (start >= S.size() && out.size() >= 3)
        {
            res = out;
            return;
        }
        for (int i = start; i < S.size(); ++i)
        {
            string cur = S.substr(start, i - start + 1);
            if ((cur.size() > 1 && cur[0] == '0') || cur.size() > 10)
                break;
            long num = stol(cur), len = out.size();
            if (num > INT_MAX)
                break;
            if (out.size() >= 2 && num != (long)out[len - 1] + out[len - 2])
                continue;
            out.push_back(num);
            helper(S, i + 1, out, res);
            out.pop_back();
        }
    }
};