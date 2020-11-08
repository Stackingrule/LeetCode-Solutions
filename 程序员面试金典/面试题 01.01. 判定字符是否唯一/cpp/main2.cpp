class Solution
{
public:
    bool isUnique(string astr)
    {
        vector<int> idx(256, 0);
        for (int i = 0; i < astr.size(); ++i)
        {
            if (idx[astr[i]] == 0)
            {
                idx[astr[i]]++;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
};