class Solution
{
public:
    string restoreString(string s, vector<int> &indices)
    {
        int len = s.size();
        vector<char> result(len);
        for (int i = 0; i < len; ++i)
        {
            result[indices[i]] = s[i];
        }

        for (int i = 0; i < len; ++i)
        {
            cout << result[i] << endl;
        }

        return string(result.begin(), result.end());
    }
};