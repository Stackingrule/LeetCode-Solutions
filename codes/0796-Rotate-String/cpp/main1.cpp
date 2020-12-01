class Solution
{
public:
    bool rotateString(string A, string B)
    {
        if (A.size() != B.size())
            return false;
        if (A.size() == 0 && B.size() == 0) // 注意边界条件
            return true;
        for (int i = 0; i < A.size(); ++i)
        {
            if (A.substr(i, A.size() - i) + A.substr(0, i) == B)
                return true;
        }
        return false;
    }
};