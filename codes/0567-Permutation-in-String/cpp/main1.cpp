class Solution
{
public:
    bool checkInclusion(string s1, string s2)
    {
        int n1 = s1.size(), n2 = s2.size(), cnt = n1, left = 0;
        vector<int> m(128);
        for (char c : s1) ++m[c];
        for (int right = 0; right < s2.size(); ++right)
        {
            if (m[s2[right]]-- > 0) --cnt;
            while (cnt == 0)
            {
                if (right - left + 1 == n1) return true;
                if (++m[s2[left++]] > 0) ++cnt;
            }
        }
        return false;
    }
};