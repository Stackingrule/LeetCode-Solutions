class Solution
{
public:
    int countMatches(vector<vector<string>> &items, string ruleKey, string ruleValue)
    {
        int count = 0, index = 0;
        if (ruleKey[0] == 'c')
            index = 1;
        else if (ruleKey[0] == 'n')
            index = 2;
        for (auto &vec : items)
        {
            if (vec[index] == ruleValue)
                count++;
        }
        return count;
    }
};