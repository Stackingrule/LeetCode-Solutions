class Solution
{
public:
    bool canFormArray(vector<int> &arr, vector<vector<int>> &pieces)
    {
        unordered_map<int, int> m;
        for (int i = 0; i < pieces.size(); ++i)
        {
            m[pieces[i][0]] = i;
        }
        int i = 0;
        while (i < arr.size())
        {
            if (!m.count(arr[i]))
                return false;
            vector<int> cur = pieces[m[arr[i]]];
            for (int c : cur)
            {
                if (c != arr[i++])
                {
                    return false;
                }
            }
        }
        return true;
    }
};