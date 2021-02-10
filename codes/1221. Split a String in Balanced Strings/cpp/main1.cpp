class Solution
{
public:
    int balancedStringSplit(string s)
    {
        int ans = 0;
        int left = 0;
        for (char c : s)
        {
            if (c == 'L') ++left;
            else --left;
            if (left == 0) ++ans;
        }
        return ans;
    }
};