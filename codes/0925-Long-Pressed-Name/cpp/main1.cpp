class Solution
{
public:
    bool isLongPressedName(string name, string typed)
    {
        int i = 0, j = 0, m = name.size(), n = typed.size();
        while (i < m || j < n)
        {
            int start1 = i, start2 = j;
            while (i < m - 1 && name[i] == name[i + 1])
                ++i;
            while (j < n - 1 && typed[j] == typed[j + 1])
                ++j;
            if (j - start2 + 1 < i - start1 + 1)
                return false;
            ++i;
            ++j;
        }
        return i == m && j == n;
    }
};